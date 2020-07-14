import java.util.Scanner;


 
 
 
 
 
 
 
 
 
 
 public class Day{
 
 
	private int day;
 
 
 
 
 
 
	public void Calendar_MonthMode()//建立一個月行事曆模式
	{
		 String Date[] = new String [30];//建立一個size為30的array去存取11月的30天
		 int i;
		 String blank1="     ";
		 String blank2="    ";
		
		for(i=0;i<30;i++)//建立一個迴圈產生月行事曆
	  {
			if(i<9)
			{
				Date[i]=Integer.toString(i+1)+blank1;//當i<9時，Date[i]的形式
			}
			else if(i>=9&&i<=29)
			{
				Date[i]=Integer.toString(i+1)+blank2;//當9<=i<=29時，Date[i]的形式
			}
		 
	   }
		  System.out.println("                2012年 11月               ");
		  System.out.println("Sun.  Mon.  Tue.  Wed.  Thu.  Fri.  Sat.");
		  System.out.println("                        "+Date[0]+Date[1]+Date[2]);
		  System.out.println(Date[3]+Date[4]+Date[5]+Date[6]+Date[7]+Date[8]+Date[9]);
		  System.out.println(Date[10]+Date[11]+Date[12]+Date[13]+Date[14]+Date[15]+Date[16]);
		  System.out.println(Date[17]+Date[18]+Date[19]+Date[20]+Date[21]+Date[22]+Date[23]);
		  System.out.println(Date[24]+Date[25]+Date[26]+Date[27]+Date[28]+Date[29]);
		  
           //以上是月行事曆顯示
   
   
   
   
		int i;
		for(i=1;i!=0;i++)//The following is an infinite loop
		{
			System.out.println("Input exit to exit");
			System.out.println("Input day-11/XX to view the activity on which day you just pressed");  //顯示提示使用者輸入指令
	   
			Scanner keyboard = new Scanner(System.in);
			String input1 = keyboard.next();//宣告一字串"input1"
	   
			if(input1.substring(0,7).equals("day-11/")==true)//若符合要求則進入Daymode
			{
				All.set_day(input1);
				int daynumber = All.get_day();
				All.DayMode(daynumber);
			}
			else if(input1.equals("exit")==true)//若符合要求則離開系統
			{
				System.out.println("Thank you for using this system"); 
				System.exit(0);
			}
			else//若不符合以上要求則顯示輸入錯誤的訊息
			{
				System.out.println("you enter the wrong words");    
			}
		}
  
  
 
 
 
	public void set_day(String input1)//建立一method去存取天數
	{
		int m = input1.chartAt(7)-48;
		int n = input1.chartAt(8)-48;
		day = m*10+n;//天數=十位數*10+個位數
	}
 
 
	public int get_day()
	{
		return day;
	}


	
 
 
 

 
 
	public class DayMode(int day)//建立Daymode的class
	{
		Scanner keyboard = new Scanner(System.in);
		String input2 = keyboard.next();
		if(input2.substring(0,4).equals("add-")==true)//若符合要求則存取新增的活動
		{
			String [] start = new String[];
			start [] = input2.substring(4,9);//存取開始時間
			String [] end = new String[];
			end [] = intput2.substring(10,15);//存取結束時間
			String [] activity = new String[];
			activity [] = input2.substring(16);//存取活動
		}
		else if(input2.substring(0,4).equals("del-"))//若符合要求則刪除活動
		{
			Day.Delete();
		}

		else if(input2.equals("month"))//若符合要求則返回月行事曆模式
		{
			Day.Month();
		}
		else if(input2.equals("exit"))//若符合要求則離開系統
		{
			System.out.println("Thank you for using this system"); 
			System.exit(0);
		}
		else//若不符合以上要求則顯示輸入錯誤的訊息
		{
			Day.Option();
		}
   
		public String Add(String input2)//建立一功能為新增活動的method
		{
	
			int i;
			for(i=0,i>=0;i++) 
			new start[i] = start[i];
			new end[i] = end[i];
			new activity[i] = activity[i];
	
  
  
  
  
  
  
  
  
		public String Delete(String input2)//建立一功能為新增活動的method
		{
		System.out.println("Sorry!This function has not been constructed yet!");
		} 
   
   
   
   
		public String Month(String input2)//建立一功能為返回月行事曆的method
		{ 
      
		}
   
  
  
  


   
  
		public void Option(String input2)//建立一功能為顯示提供輸入指令的method
		{
			System.out.println("Sorry,you input the wrong order,please choose one of the followings to input new order.")
			System.out.println("Input month to month-mode calender");
			System.out.println("Input add-[活動時間]-[活動名稱] to add activity");
			System.out.println("Input del-[活動編號] to delete activity");
			System.out.println("Input exit to exit");
	  
 
		}
  
  
  
	}
  
 }
 
 }
 
 