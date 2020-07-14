import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class GameActivityGenerator_hw4
{
	public static void main(String args[])
	{
		String event_list[]={"PWF","ERQ","LOL","TYP","EXC","EOW"};
		String contest_list[]={"ICSC","BOWL","TOUR","IDSC","FMSC"};
		int event_num = event_list.length;
		int contest_num = contest_list.length;
		int round_num = 5;
		PrintWriter event_writer=null;
		PrintWriter contest_writer=null;
		try{
			event_writer= new PrintWriter(new File("event.txt"));
			contest_writer = new PrintWriter(new File("contest.txt"));	
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found!");
			e.printStackTrace();
		}
		Random r=new Random();
		for(int i=0;i<round_num;i++)
		{
			event_writer.println(event_list[r.nextInt(event_num)]);
			contest_writer.println(contest_list[r.nextInt(contest_num)]);
		}
		event_writer.flush();
		contest_writer.flush();
		event_writer.close();
		contest_writer.close();
	}
}