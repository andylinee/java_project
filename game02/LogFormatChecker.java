import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LogFormatChecker {
	private Vector<String> block_string = null;
	private Vector<String> block_string_c = null;
	private int line_numbers[]={3,8,8,8,8,8,4};
	private String line_format[][]={
		{"Game Start","P1-\\w+\\[(?:HK|BR|PB),[0-9]*[1-9][0-9]*,\\d+,\\d+,\\d+\\]","P2-\\w+\\[(?:HK|BR|PB),[0-9]*[1-9][0-9]*,\\d+,\\d+,\\d+\\]"},
		{"Playing-[1-5]","P1-\\w+\\[\\w{3},\\w{3}\\]","P2-\\w+\\[\\w{3},\\w{3}\\]","Event-\\w{3}","Contest-\\w{4}","(?:Winner-\\w+)|(?:Tie Game)","P1-\\w+\\[(?:HK|BR|PB),[0-9]*[1-9][0-9]*,\\d+,\\d+,\\d+\\]","P2-\\w+\\[(?:HK|BR|PB),[0-9]*[1-9][0-9]*,\\d+,\\d+,\\d+\\]"},
		{"Game Set","P1-\\w+\\[(?:HK|BR|PB),[0-9]*[1-9][0-9]*,\\d+,\\d+,\\d+,[0-9]*[1-9][0-9]*\\]","P2-\\w+\\[(?:HK|BR|PB),[0-9]*[1-9][0-9]*,\\d+,\\d+,\\d+,[0-9]*[1-9][0-9]*\\]","(?:Hero-\\w+)|(?:Tie Game)"}
	};//regex of format for each item type
	private String del="#";
	private String filename = "log.txt";	// log file name for checking
	
	
	private int block_number=7;
	private int round_number=5;
	public static void main (String args[])
	{
		File log_file=new File("log.txt");
		
		
		if(log_file.exists())
		{
			System.out.println("\nFile \""+log_file.getName()+"\" exists!");
			LogFormatChecker lc=new LogFormatChecker();
			/*
			 * load the contents of log.txt and log_correct.txt
			 */
			lc.LoadBlocks(log_file, lc.del);
			
			System.out.println("Format Checking......\n");
			
			/*
			 * check the number of the blocks 
			 */
			boolean blockNum_check=true;
			lc.printDivider("Block Number Checking");
			blockNum_check=lc.BlockNumberChecker(lc.block_number);
			lc.printResult(blockNum_check, "-", "Block Number Checking");
			
			/*
			 * check the number of the items in every block
			 */
			boolean itemNum_check=true;
			lc.printDivider("Item Number Checking");
			for (int count=0; count<lc.block_string.size(); count++)
				itemNum_check = itemNum_check && lc.ItemNumberChecker(count,lc.block_string.get(count).split("\n"));
			lc.printResult(itemNum_check, "-", "Item Number (in each block) Checking");
			
			/*
			 * check the format of every item in each block
			 */
			boolean format_check=true;
			lc.printDivider("Item Format Checking");
			format_check = format_check && lc.ItemFormatChecker(0, 0, lc.block_string.get(0).split("\n"));
			for (int round=1; round < lc.round_number+1; round++)
				format_check = format_check && lc.ItemFormatChecker(round, 1, lc.block_string.get(round).split("\n"));// && Lazy evaluation !!
			format_check = format_check && lc.ItemFormatChecker(lc.block_number-1, 2, lc.block_string.get(lc.block_number-1).split("\n"));// && Lazy evaluation !!
			lc.printResult(format_check, "-", "Item Format Checking");
		}
		else
		{
			System.out.println("\nFile \""+log_file.getName()+"\" isn't found!");
		}
		System.out.println("\t\t-Powered by DBSE IntroCS Homework Group.-");
	}
	private boolean ItemFormatChecker(int block,int type, String[] splitted_block)
	{
		Vector<String> temp=this.trimArray(splitted_block);
		boolean result=true;
		boolean temp_result=true;
		String log_str = "";
		int log_index=0;
		for(int item=0; item < line_numbers[block]; item++)
		{
			Pattern pattern = Pattern.compile(line_format[type][item]);
			Matcher matcher=pattern.matcher(temp.get(item));
			log_str = temp.get((log_index=item));
			boolean matchFound = matcher.find();
			//System.out.println("<"+temp.get(item)+">"+matcher.matches());
			temp_result = temp_result && matcher.matches();
			result = result && temp_result;
			if(!result)
				break;
		}
		if (temp_result)
			System.out.println("Block "+(block+1)+" item format: Passed.");
		else
			System.out.println("Block "+(block+1)+" item format: Failed. (Wrong Item "+ (log_index+1)+" : <"+log_str+">)");
		return result;
	}
	private void LoadBlocks(File f, String delimiter)
	{
		this.block_string = new Vector<String>();
		this.block_string_c = new Vector<String>();
		try {
			Scanner scan = new Scanner(f);
			scan.useDelimiter(delimiter);
			String temp=null,temp2=null;
			while( (scan.hasNext()))
			{
				temp=scan.next();
				if (!temp.trim().equals(""))
				{
					//System.out.println("<"+temp.trim().length()+">");
					block_string.add(temp.trim());
				}
			}
		}
		catch(IOException ioe)
		{
			System.out.println("IOException caught during blocks loading.");
		}
	}
	private boolean ItemNumberChecker(int block, String[] splitted_block)
	{
		int line;
		boolean result=true;
		//boolean temp_result=true;
		Vector<String> items = this.trimArray(splitted_block);
		line = items.size();
		result = (line == line_numbers[block]);
		if (result)
			System.out.println("Block "+(block+1)+" item number: Passed.");
		else
			System.out.println("Block "+(block+1)+" item number: Failed. ("+line+"/"+line_numbers[block]+")");
		return result;
	}
	private boolean BlockNumberChecker(int correct_block)
	{
		block_string.trimToSize();
		int block = block_string.size();
		//System.out.println("<"+block_string.get(6)+">");
		System.out.println("There are totally "+block+" blocks. ("+block+"/"+correct_block+")");
		return block == correct_block;

	}
	private Vector<String> trimArray(String[] input)
	{
		Vector<String> r = new Vector<String>();
		String re[]=null;
		for(int i=0;i<input.length;i++)
		{
			String temp = input[i].replace("\\n","");
				if(!(temp=temp.trim()).equals(""))
					r.add(temp);
		}
		return r;
	}
	public void printDivider()
	{
		System.out.println("");
	}
	public void printDivider(String topic)
	{
		System.out.println("--------------------"+topic+"--------------------");
	}
	public void printResult(boolean result, String case_number, String case_name)
	{
		if(result)
			System.out.println(" --> Case "+case_number+" "+case_name+":Passed.");
		else
		{
			System.out.println(" --> Case "+case_number+" "+case_name+":Failed.");
			System.exit(0);
		}
		printDivider();
	}
}
