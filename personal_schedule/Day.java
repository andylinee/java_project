import java.util.Scanner;


 
 
 
 
 
 
 
 
 
 
 public class Day{
 
 
	private int day;
 
 
 
 
 
 
	public void Calendar_MonthMode()//�إߤ@�Ӥ��ƾ�Ҧ�
	{
		 String Date[] = new String [30];//�إߤ@��size��30��array�h�s��11�몺30��
		 int i;
		 String blank1="     ";
		 String blank2="    ";
		
		for(i=0;i<30;i++)//�إߤ@�Ӱj�鲣�ͤ��ƾ�
	  {
			if(i<9)
			{
				Date[i]=Integer.toString(i+1)+blank1;//��i<9�ɡADate[i]���Φ�
			}
			else if(i>=9&&i<=29)
			{
				Date[i]=Integer.toString(i+1)+blank2;//��9<=i<=29�ɡADate[i]���Φ�
			}
		 
	   }
		  System.out.println("                2012�~ 11��               ");
		  System.out.println("Sun.  Mon.  Tue.  Wed.  Thu.  Fri.  Sat.");
		  System.out.println("                        "+Date[0]+Date[1]+Date[2]);
		  System.out.println(Date[3]+Date[4]+Date[5]+Date[6]+Date[7]+Date[8]+Date[9]);
		  System.out.println(Date[10]+Date[11]+Date[12]+Date[13]+Date[14]+Date[15]+Date[16]);
		  System.out.println(Date[17]+Date[18]+Date[19]+Date[20]+Date[21]+Date[22]+Date[23]);
		  System.out.println(Date[24]+Date[25]+Date[26]+Date[27]+Date[28]+Date[29]);
		  
           //�H�W�O���ƾ����
   
   
   
   
		int i;
		for(i=1;i!=0;i++)//The following is an infinite loop
		{
			System.out.println("Input exit to exit");
			System.out.println("Input day-11/XX to view the activity on which day you just pressed");  //��ܴ��ܨϥΪ̿�J���O
	   
			Scanner keyboard = new Scanner(System.in);
			String input1 = keyboard.next();//�ŧi�@�r��"input1"
	   
			if(input1.substring(0,7).equals("day-11/")==true)//�Y�ŦX�n�D�h�i�JDaymode
			{
				All.set_day(input1);
				int daynumber = All.get_day();
				All.DayMode(daynumber);
			}
			else if(input1.equals("exit")==true)//�Y�ŦX�n�D�h���}�t��
			{
				System.out.println("Thank you for using this system"); 
				System.exit(0);
			}
			else//�Y���ŦX�H�W�n�D�h��ܿ�J���~���T��
			{
				System.out.println("you enter the wrong words");    
			}
		}
  
  
 
 
 
	public void set_day(String input1)//�إߤ@method�h�s���Ѽ�
	{
		int m = input1.chartAt(7)-48;
		int n = input1.chartAt(8)-48;
		day = m*10+n;//�Ѽ�=�Q���*10+�Ӧ��
	}
 
 
	public int get_day()
	{
		return day;
	}


	
 
 
 

 
 
	public class DayMode(int day)//�إ�Daymode��class
	{
		Scanner keyboard = new Scanner(System.in);
		String input2 = keyboard.next();
		if(input2.substring(0,4).equals("add-")==true)//�Y�ŦX�n�D�h�s���s�W������
		{
			String [] start = new String[];
			start [] = input2.substring(4,9);//�s���}�l�ɶ�
			String [] end = new String[];
			end [] = intput2.substring(10,15);//�s�������ɶ�
			String [] activity = new String[];
			activity [] = input2.substring(16);//�s������
		}
		else if(input2.substring(0,4).equals("del-"))//�Y�ŦX�n�D�h�R������
		{
			Day.Delete();
		}

		else if(input2.equals("month"))//�Y�ŦX�n�D�h��^���ƾ�Ҧ�
		{
			Day.Month();
		}
		else if(input2.equals("exit"))//�Y�ŦX�n�D�h���}�t��
		{
			System.out.println("Thank you for using this system"); 
			System.exit(0);
		}
		else//�Y���ŦX�H�W�n�D�h��ܿ�J���~���T��
		{
			Day.Option();
		}
   
		public String Add(String input2)//�إߤ@�\�ର�s�W���ʪ�method
		{
	
			int i;
			for(i=0,i>=0;i++) 
			new start[i] = start[i];
			new end[i] = end[i];
			new activity[i] = activity[i];
	
  
  
  
  
  
  
  
  
		public String Delete(String input2)//�إߤ@�\�ର�s�W���ʪ�method
		{
		System.out.println("Sorry!This function has not been constructed yet!");
		} 
   
   
   
   
		public String Month(String input2)//�إߤ@�\�ର��^���ƾ䪺method
		{ 
      
		}
   
  
  
  


   
  
		public void Option(String input2)//�إߤ@�\�ର��ܴ��ѿ�J���O��method
		{
			System.out.println("Sorry,you input the wrong order,please choose one of the followings to input new order.")
			System.out.println("Input month to month-mode calender");
			System.out.println("Input add-[���ʮɶ�]-[���ʦW��] to add activity");
			System.out.println("Input del-[���ʽs��] to delete activity");
			System.out.println("Input exit to exit");
	  
 
		}
  
  
  
	}
  
 }
 
 }
 
 