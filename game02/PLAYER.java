import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;


public class PLAYER{                    //�إߤ@��PLAYER��class�H�U��constructor
	public String character;
	public String playername;
	public Identity identity;
	public static String winner;
	public static String finalwinner;
	public static String act1_1 = null;
	public static String act1_2 = null;
	public static String act2_1 = null;
    public static String act2_2 = null;
	public static int next;
	public static int ga1 = 0;
	public static int ga2 = 0;
	///////�H�U��constructor
	public PLAYER(String eachplayername){
		
		playername = eachplayername;
		
	}
	
	//�H�U�إߦbmain class�ݭn�Ψ줧methods
	String c1, c2;
	
	
	
	public void setIdentity(Identity i)//////////�Q��up-casting�Ϩ�̷ӶǤJ��i�Ȭ��s��HK/BR/PB��object
	{
		this.identity = i;
	}
	
	public static void print(String c1, String c2, String n1, String n2, PLAYER player1, PLAYER player2){//////////�L�X��ɪ�����W�١B�����B�U����O�ȤγӧQ����

		PLAYER.print1(c1, n1, player1);
		System.out.println("");
		PLAYER.print2(c2, n2, player2);
	
	}
	
	public static void print1(String c1, String n1, PLAYER player1){/////////�̷Ӫ��a�@��J�������L�X��ɪ�����W�١B�����B�U����O�ȤγӧQ����
		if(c1.equals("HK")){
			System.out.println("���a�@ : "+player1.identity.playername);
			System.out.println("�����W�� : HK �v��");
			System.out.println("��O : 100");
			System.out.println("���O : 90");
			System.out.println("�y�O : 60");
			System.out.println("�ӧQ�O�� : 0");
		}
		else if(c1.equals("BR")){
			System.out.println("���a�@ : "+player1.identity.playername);
			System.out.println("�����W�� : BR ����");
			System.out.println("��O : 80");
			System.out.println("���O : 100");
			System.out.println("�y�O : 70");
			System.out.println("�ӧQ�O�� : 0");
		}
		else if(c1.equals("PB")){
			System.out.println("���a�@ : "+player1.identity.playername);
			System.out.println("�����W�� : PB ���@");
			System.out.println("��O : 110");
			System.out.println("���O : 60");
			System.out.println("�y�O : 80");
			System.out.println("�ӧQ�O�� : 0");
		}
		
	}

	public static void print2(String c2, String n2, PLAYER player2){	/////////�̷Ӫ��a�@��J�������L�X��ɪ�����W�١B�����B�U����O�ȤγӧQ����
		
		if(c2.equals("HK")){
			System.out.println("���a�G : "+player2.identity.playername);
			System.out.println("�����W�� : HK �v��");
			System.out.println("��O : 100");
			System.out.println("���O : 90");
			System.out.println("�y�O : 60");
			System.out.println("�ӧQ�O�� : 0");
		}
		else if(c2.equals("BR")){
			System.out.println("���a�G : "+player2.identity.playername);
			System.out.println("�����W�� : BR ����");
			System.out.println("��O : 80");
			System.out.println("���O : 100");
			System.out.println("�y�O : 70");
			System.out.println("�ӧQ�O�� : 0");
		}
		else if(c2.equals("PB")){
			System.out.println("���a�G : "+player2.identity.playername);
			System.out.println("�����W�� : PB ���@");
			System.out.println("��O : 110");
			System.out.println("���O : 60");
			System.out.println("�y�O : 80");
			System.out.println("�ӧQ�O�� : 0");
		}
	
	
	}
	
	public static void stage1(PLAYER player1, PLAYER player2, String c1, String c2){ /////////�Ĥ@���q�C��
	
		for(next=0;next<=1;next++){	  ///////////���ʶ��q��2���j��
					
			player1.identity.Input();  ////////�L�X���a�@�i��ܤ����ʦC��
			Scanner scannerObject = new Scanner(System.in);		
			String act1 = scannerObject.next();  //�إ߷sobject"act1"�����a�@��J�����ʥN��
			player1.identity.Activity1(act1);  ////���a�@�i�次�ʫ���ܯ�O��
			player2.identity.Input();   ////////�L�X���a�@�i��ܤ����ʦC��
			String act2 = scannerObject.next();  //�إ߷sobject"act2"�����a�G��J�����ʥN��	
			player2.identity.Activity2(act2);	////���a�@�i�次�ʫ���ܯ�O��		
		    //�H�U�x�s�U�^�X���a�@�Ϊ��a�G�ҿ�ܤ����ʥN��
			if(next==0){      
				act1_1 = act1;
				act2_1 = act2;
			}
			else if(next==1){
				act1_2 = act1;
				act2_2 = act2;
			}
						
			//�H�U��ܪ��a�@�M���a�G�g�L���ʫ᪺����W�١B�����B�U����O�ȤγӧQ����
			System.out.println("Player1 : "+player1.identity.playername);
			System.out.println("���� :"+c1);
			System.out.println("��O :"+player1.identity.energy);
			System.out.println("���O :"+player1.identity.intelligence);
			System.out.println("�y�O :"+player1.identity.glamor);
			System.out.println("�ӧQ�O�� :"+player1.identity.victoryrecord);
			System.out.println("Player2 : "+player2.identity.playername);
			System.out.println("���� :"+c2);
			System.out.println("��O :"+player2.identity.energy);
			System.out.println("���O :"+player2.identity.intelligence);
			System.out.println("�y�O :"+player2.identity.glamor);
			System.out.println("�ӧQ�O�� :"+player2.identity.victoryrecord);
		}
		//�H�U���s�]�w���a�@�Ϊ��a�G����ܬ��ʱ���
		player1.identity.Reset();  
		player2.identity.Reset();
	}
	
	 
	public static void stage2(String event, PLAYER player1, PLAYER player2, String c1, String c2){ ////////�ĤG���q�C��
		player1.identity.Event1(event, player2);   /////���榹�ƥ�缾�a�@�y�����v�T
		player2.identity.Event2(event, player1);   /////���榹�ƥ�缾�a�G�y�����v�T
		PrintEvent(player1, player2, event, c1, c2);    ////�L�X��ɪ��a�@�Ϊ��a�G������W�١B�����B�U����O�ȤγӧQ����
	
	} 
	 
	public static void PrintEvent(PLAYER player1, PLAYER player2, String event, String c1, String c2){  ////�̷�Ū����String�h�L�X�Y�N�i�檺�ƥ�æL�X��ɪ��a�@�Ϊ��a�G������W�١B�����B�U����O�ȤγӧQ����
		
		if(event.equals("PWF"))
			System.out.println("�Y�N�o��\"PWF ���q\"");
		else if(event.equals("ERQ"))
			System.out.println("�Y�N�o��\"ERQ �a�_\"");
		else if(event.equals("LOL"))
			System.out.println("�Y�N�|��\"LOL LOL�j��\"");
		else if(event.equals("TYP"))
			System.out.println("�Y�N�o��\"TYP �䭷��\"");
		else if(event.equals("EXC"))
			System.out.println("�Y�N�o��\"EXC �����P��\"");
		else if(event.equals("EOW"))
			System.out.println("�Y�N�o��\"EOW �㥽�鮣�W\"");
			
		
			
		System.out.println("Player1 : "+player1.identity.playername);
		System.out.println("���� :"+c1);
		System.out.println("��O :"+player1.identity.energy);
		System.out.println("���O :"+player1.identity.intelligence);
		System.out.println("�y�O :"+player1.identity.glamor);
		System.out.println("�ӧQ�O�� :"+player1.identity.victoryrecord);
		System.out.println("Player2 : "+player2.identity.playername);
		System.out.println("");
		System.out.println("���� :"+c1);
		System.out.println("��O :"+player2.identity.energy);
		System.out.println("���O :"+player2.identity.intelligence);
		System.out.println("�y�O :"+player2.identity.glamor);
		System.out.println("�ӧQ�O�� :"+player2.identity.victoryrecord);		
		
	} 
	 
	public static void stage3(String contest, PLAYER player1, PLAYER player2, String c1, String c2){  /////�ĤT���q�C��
		
		
		PLAYER.Ga1(contest, player1);   //�p�⪱�a�@���ǥX��{��
		PLAYER.Ga2(contest, player2);   //�p�⪱�a�@���ǥX��{��
		PLAYER.changeaftercontest(contest, ga1, ga2, player1, player2);
		PLAYER.PrintContest(contest, player1, player2, c1, c2);
		 //��ܪ��a�@�M���a�G�g�L�v�ɼv�T�᪺��O��
	
	} 
	
	public static void PrintContest(String contest, PLAYER player1, PLAYER player2, String c1, String c2){ ////�L�X�Y�N�i�檺�v�ɨæL�X��ɪ��a�@�Ϊ��a�G������W�١B�����B�U����O�ȤγӧQ����
	
		if(contest.equals("ICSC"))//�Ycontest��"ICSC"�h�i��{}����statement
		{
			System.out.println("�Y�N�i��\"�p���Ҹ�\"");
			
		}
		else if(contest.equals("BOWL"))  //�Ycontest��"BOWL"�h�i��{}����statement
		{
			System.out.println("�Y�N�i��\"���O�ֲy\"");
			
		}
		else if(contest.equals("TOUR"))  //�Ycontest��"TOUR"�h�i��{}����statement
		{
			System.out.println("�Y�N�i��\"�Z�ڥX�C\"");
			
		}
		else if(contest.equals("IDSC"))  //�Ycontest��"IDSC"�h�i��{}����statement
		{
			System.out.println("�Y�N�i��\"�t����\"");
			
		}
		else if(contest.equals("FMSC"))  //�Ycontest��"FMSC"�h�i��{}����statement
		{
			System.out.println("�Y�N�i��\"�Ǭ��v��\"");
			
		}
		
		System.out.println("Player1 : "+player1.identity.playername);
		System.out.println("���� :"+c1);
		System.out.println("��O :"+player1.identity.energy);
		System.out.println("���O :"+player1.identity.intelligence);
		System.out.println("�y�O :"+player1.identity.glamor);
		System.out.println("�ӧQ�O�� :"+player1.identity.victoryrecord);
		System.out.println("");
		System.out.println("Player2 : "+player2.identity.playername);
		System.out.println("���� :"+c2);
		System.out.println("��O :"+player2.identity.energy);
		System.out.println("���O :"+player2.identity.intelligence);
		System.out.println("�y�O :"+player2.identity.glamor);
		System.out.println("�ӧQ�O�� :"+player2.identity.victoryrecord);	
		
	}
	 
	
	public static int Ga1(String contest, PLAYER player1){       //////////�p�⪱�a�@���ǥX��{��
		//int ga1=0;
		if(contest.equals("ICSC"))//�Ycontest��"ICSC"�h�i��{}����statement
		{
		
			ga1 = player1.identity.energy*2 + player1.identity.intelligence*4 + player1.identity.glamor*1;  //�p�⪱�a�@���ǥX��{��
			return ga1;

		}
		else if(contest.equals("BOWL"))  //�Ycontest��"BOWL"�h�i��{}����statement
		{
			
			ga1 = player1.identity.energy*4 + player1.identity.intelligence*2 + player1.identity.glamor*1;  //�p�⪱�a�@���ǥX��{��
			return ga1;
			
		}
		else if(contest.equals("TOUR"))  //�Ycontest��"TOUR"�h�i��{}����statement
		{
			
			ga1 = player1.identity.energy*2 + player1.identity.intelligence*1 + player1.identity.glamor*4;  //�p�⪱�a�@���ǥX��{��
			return ga1;
			
		}
		if(contest.equals("IDSC"))  //�Ycontest��"IDSC"�h�i��{}����statement
		{
			
			ga1 = player1.identity.energy*2 + player1.identity.intelligence*1 + player1.identity.glamor*3;  //�p�⪱�a�@���ǥX��{��
			return ga1;
			
		}
		if(contest.equals("FMSC"))  //�Ycontest��"FMSC"�h�i��{}����statement
		{
		
			ga1 = player1.identity.energy*1 + player1.identity.intelligence*4 ;  //�p�⪱�a�@���ǥX��{��
			
			return ga1;
			
		}
		return ga1;
	}
	
	
	public static int Ga2(String contest, PLAYER player2){   ////////�p�⪱�a�G���ǥX��{��
		//int ga2=0;
	
		if(contest.equals("ICSC"))//�Ycontest��"ICSC"�h�i��{}����statement
		{
			
			ga2 = player2.identity.energy*2 + player2.identity.intelligence*4 + player2.identity.glamor*1;  //�p�⪱�a�G���ǥX��{��
			return ga2;

		}
		else if(contest.equals("BOWL"))  //�Ycontest��"BOWL"�h�i��{}����statement
		{
			
			ga2 = player2.identity.energy*4 + player2.identity.intelligence*2 + player2.identity.glamor*1;  //�p�⪱�a�G���ǥX��{��
			return ga2;
			
		}
		else if(contest.equals("TOUR"))  //�Ycontest��"TOUR"�h�i��{}����statement
		{
			
			ga2 = player2.identity.energy*2 + player2.identity.intelligence*1 + player2.identity.glamor*4;  //�p�⪱�a�G���ǥX��{��
			return ga2;
			
		}
		if(contest.equals("IDSC"))  //�Ycontest��"IDSC"�h�i��{}����statement
		{
			
			ga2 = player2.identity.energy*2 + player2.identity.intelligence*1 + player2.identity.glamor*3;  //�p�⪱�a�G���ǥX��{��
			return ga2;
			
		}
		if(contest.equals("FMSC"))  //�Ycontest��"FMSC"�h�i��{}����statement
		{
			
			ga2 = player2.identity.energy*1 + player2.identity.intelligence*4 ;  //�p�⪱�a�G���ǥX��{��
			return ga2;
			
		}
		return ga2;
	}
	
	
	public static void changeaftercontest(String contest, int g1, int g2, PLAYER player1, PLAYER player2){  ////////�g�L�v�ɧ��ܯ�O��
	
		player1.identity.ChangeAfterContest1(contest, g1, g2);  /////�̷�Ū���줧�v�ɥh���ܪ��a�@����O��
		player2.identity.ChangeAfterContest2(contest, g1, g2);  /////�̷�Ū���줧�v�ɥh���ܪ��a�G����O��
		
	}
	
	
	public static void finaltest(PLAYER player1, PLAYER player2){  /////�p�⦹�C��Ĺ�a
		int totalP1 = player1.identity.energy + player1.identity.intelligence + player1.identity.glamor + player1.identity.victoryrecord*60;  //�̳y"�㥽��f�P��{��"�p��X���a�@���㥽�f�P��
		int totalP2 = player2.identity.energy + player2.identity.intelligence + player2.identity.glamor + player2.identity.victoryrecord*60;  //�̳y"�㥽��f�P��{��"�p��X���a�@���㥽�f�P��
		System.out.println("���a�@���㥽�f�P�Ȭ� "+totalP1);
		System.out.println("���a�G���㥽�f�P�Ȭ� "+totalP2);
		//�H�U�P�_��̬�Ĺ�a
		if(totalP1>totalP2){
			System.out.println("�o���C����Ĺ�a�O���a�@ "+player1.identity.playername);
			finalwinner = "Hero- "+player1.identity.playername;
			System.out.println("���߱z����\"�㥽��^��\"!");
			}		
		else if(totalP1<totalP2){
			System.out.println("�o���C����Ĺ�a�O���a�G "+player2.identity.playername);
			finalwinner = "Hero- "+player2.identity.intelligence;
			System.out.println("���߱z����\"�㥽��^��\"!");
		}
		else{
			finalwinner = "Tie Game";
			System.out.println("�o�����ɪ��a�@ "+player1.identity.playername+" �M���a�G "+player2.identity.playername+" ����");
		}
	}
	
	
}