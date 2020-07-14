import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;


public class PLAYER{                    //建立一個PLAYER的class以下為constructor
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
	///////以下為constructor
	public PLAYER(String eachplayername){
		
		playername = eachplayername;
		
	}
	
	//以下建立在main class需要用到之methods
	String c1, c2;
	
	
	
	public void setIdentity(Identity i)//////////利用up-casting使其依照傳入之i值為新的HK/BR/PB的object
	{
		this.identity = i;
	}
	
	public static void print(String c1, String c2, String n1, String n2, PLAYER player1, PLAYER player2){//////////印出當時的角色名稱、身分、各項能力值及勝利紀錄

		PLAYER.print1(c1, n1, player1);
		System.out.println("");
		PLAYER.print2(c2, n2, player2);
	
	}
	
	public static void print1(String c1, String n1, PLAYER player1){/////////依照玩家一輸入的身分印出當時的角色名稱、身分、各項能力值及勝利紀錄
		if(c1.equals("HK")){
			System.out.println("玩家一 : "+player1.identity.playername);
			System.out.println("身分名稱 : HK 宅神");
			System.out.println("體力 : 100");
			System.out.println("智力 : 90");
			System.out.println("魅力 : 60");
			System.out.println("勝利記錄 : 0");
		}
		else if(c1.equals("BR")){
			System.out.println("玩家一 : "+player1.identity.playername);
			System.out.println("身分名稱 : BR 卷者");
			System.out.println("體力 : 80");
			System.out.println("智力 : 100");
			System.out.println("魅力 : 70");
			System.out.println("勝利記錄 : 0");
		}
		else if(c1.equals("PB")){
			System.out.println("玩家一 : "+player1.identity.playername);
			System.out.println("身分名稱 : PB 玩咖");
			System.out.println("體力 : 110");
			System.out.println("智力 : 60");
			System.out.println("魅力 : 80");
			System.out.println("勝利記錄 : 0");
		}
		
	}

	public static void print2(String c2, String n2, PLAYER player2){	/////////依照玩家一輸入的身分印出當時的角色名稱、身分、各項能力值及勝利紀錄
		
		if(c2.equals("HK")){
			System.out.println("玩家二 : "+player2.identity.playername);
			System.out.println("身分名稱 : HK 宅神");
			System.out.println("體力 : 100");
			System.out.println("智力 : 90");
			System.out.println("魅力 : 60");
			System.out.println("勝利記錄 : 0");
		}
		else if(c2.equals("BR")){
			System.out.println("玩家二 : "+player2.identity.playername);
			System.out.println("身分名稱 : BR 卷者");
			System.out.println("體力 : 80");
			System.out.println("智力 : 100");
			System.out.println("魅力 : 70");
			System.out.println("勝利記錄 : 0");
		}
		else if(c2.equals("PB")){
			System.out.println("玩家二 : "+player2.identity.playername);
			System.out.println("身分名稱 : PB 玩咖");
			System.out.println("體力 : 110");
			System.out.println("智力 : 60");
			System.out.println("魅力 : 80");
			System.out.println("勝利記錄 : 0");
		}
	
	
	}
	
	public static void stage1(PLAYER player1, PLAYER player2, String c1, String c2){ /////////第一階段遊戲
	
		for(next=0;next<=1;next++){	  ///////////活動階段的2次迴圈
					
			player1.identity.Input();  ////////印出玩家一可選擇之活動列表
			Scanner scannerObject = new Scanner(System.in);		
			String act1 = scannerObject.next();  //建立新object"act1"為玩家一輸入之活動代號
			player1.identity.Activity1(act1);  ////玩家一進行活動後改變能力值
			player2.identity.Input();   ////////印出玩家一可選擇之活動列表
			String act2 = scannerObject.next();  //建立新object"act2"為玩家二輸入之活動代號	
			player2.identity.Activity2(act2);	////玩家一進行活動後改變能力值		
		    //以下儲存各回合玩家一及玩家二所選擇之活動代號
			if(next==0){      
				act1_1 = act1;
				act2_1 = act2;
			}
			else if(next==1){
				act1_2 = act1;
				act2_2 = act2;
			}
						
			//以下顯示玩家一和玩家二經過活動後的角色名稱、身分、各項能力值及勝利紀錄
			System.out.println("Player1 : "+player1.identity.playername);
			System.out.println("身分 :"+c1);
			System.out.println("體力 :"+player1.identity.energy);
			System.out.println("智力 :"+player1.identity.intelligence);
			System.out.println("魅力 :"+player1.identity.glamor);
			System.out.println("勝利記錄 :"+player1.identity.victoryrecord);
			System.out.println("Player2 : "+player2.identity.playername);
			System.out.println("身分 :"+c2);
			System.out.println("體力 :"+player2.identity.energy);
			System.out.println("智力 :"+player2.identity.intelligence);
			System.out.println("魅力 :"+player2.identity.glamor);
			System.out.println("勝利記錄 :"+player2.identity.victoryrecord);
		}
		//以下重新設定玩家一及玩家二的選擇活動條件
		player1.identity.Reset();  
		player2.identity.Reset();
	}
	
	 
	public static void stage2(String event, PLAYER player1, PLAYER player2, String c1, String c2){ ////////第二階段遊戲
		player1.identity.Event1(event, player2);   /////執行此事件對玩家一造成的影響
		player2.identity.Event2(event, player1);   /////執行此事件對玩家二造成的影響
		PrintEvent(player1, player2, event, c1, c2);    ////印出當時玩家一及玩家二的角色名稱、身分、各項能力值及勝利紀錄
	
	} 
	 
	public static void PrintEvent(PLAYER player1, PLAYER player2, String event, String c1, String c2){  ////依照讀取的String去印出即將進行的事件並印出當時玩家一及玩家二的角色名稱、身分、各項能力值及勝利紀錄
		
		if(event.equals("PWF"))
			System.out.println("即將發生\"PWF 停電\"");
		else if(event.equals("ERQ"))
			System.out.println("即將發生\"ERQ 地震\"");
		else if(event.equals("LOL"))
			System.out.println("即將舉行\"LOL LOL大賽\"");
		else if(event.equals("TYP"))
			System.out.println("即將發生\"TYP 颱風天\"");
		else if(event.equals("EXC"))
			System.out.println("即將發生\"EXC 物換星移\"");
		else if(event.equals("EOW"))
			System.out.println("即將發生\"EOW 芥末日恐慌\"");
			
		
			
		System.out.println("Player1 : "+player1.identity.playername);
		System.out.println("身分 :"+c1);
		System.out.println("體力 :"+player1.identity.energy);
		System.out.println("智力 :"+player1.identity.intelligence);
		System.out.println("魅力 :"+player1.identity.glamor);
		System.out.println("勝利記錄 :"+player1.identity.victoryrecord);
		System.out.println("Player2 : "+player2.identity.playername);
		System.out.println("");
		System.out.println("身分 :"+c1);
		System.out.println("體力 :"+player2.identity.energy);
		System.out.println("智力 :"+player2.identity.intelligence);
		System.out.println("魅力 :"+player2.identity.glamor);
		System.out.println("勝利記錄 :"+player2.identity.victoryrecord);		
		
	} 
	 
	public static void stage3(String contest, PLAYER player1, PLAYER player2, String c1, String c2){  /////第三階段遊戲
		
		
		PLAYER.Ga1(contest, player1);   //計算玩家一的傑出表現值
		PLAYER.Ga2(contest, player2);   //計算玩家一的傑出表現值
		PLAYER.changeaftercontest(contest, ga1, ga2, player1, player2);
		PLAYER.PrintContest(contest, player1, player2, c1, c2);
		 //顯示玩家一和玩家二經過競賽影響後的能力值
	
	} 
	
	public static void PrintContest(String contest, PLAYER player1, PLAYER player2, String c1, String c2){ ////印出即將進行的競賽並印出當時玩家一及玩家二的角色名稱、身分、各項能力值及勝利紀錄
	
		if(contest.equals("ICSC"))//若contest為"ICSC"則進行{}內之statement
		{
			System.out.println("即將進行\"計概考試\"");
			
		}
		else if(contest.equals("BOWL"))  //若contest為"BOWL"則進行{}內之statement
		{
			System.out.println("即將進行\"打保齡球\"");
			
		}
		else if(contest.equals("TOUR"))  //若contest為"TOUR"則進行{}內之statement
		{
			System.out.println("即將進行\"班際出遊\"");
			
		}
		else if(contest.equals("IDSC"))  //若contest為"IDSC"則進行{}內之statement
		{
			System.out.println("即將進行\"系砂鍋\"");
			
		}
		else if(contest.equals("FMSC"))  //若contest為"FMSC"則進行{}內之statement
		{
			System.out.println("即將進行\"學科競試\"");
			
		}
		
		System.out.println("Player1 : "+player1.identity.playername);
		System.out.println("身分 :"+c1);
		System.out.println("體力 :"+player1.identity.energy);
		System.out.println("智力 :"+player1.identity.intelligence);
		System.out.println("魅力 :"+player1.identity.glamor);
		System.out.println("勝利記錄 :"+player1.identity.victoryrecord);
		System.out.println("");
		System.out.println("Player2 : "+player2.identity.playername);
		System.out.println("身分 :"+c2);
		System.out.println("體力 :"+player2.identity.energy);
		System.out.println("智力 :"+player2.identity.intelligence);
		System.out.println("魅力 :"+player2.identity.glamor);
		System.out.println("勝利記錄 :"+player2.identity.victoryrecord);	
		
	}
	 
	
	public static int Ga1(String contest, PLAYER player1){       //////////計算玩家一的傑出表現值
		//int ga1=0;
		if(contest.equals("ICSC"))//若contest為"ICSC"則進行{}內之statement
		{
		
			ga1 = player1.identity.energy*2 + player1.identity.intelligence*4 + player1.identity.glamor*1;  //計算玩家一之傑出表現值
			return ga1;

		}
		else if(contest.equals("BOWL"))  //若contest為"BOWL"則進行{}內之statement
		{
			
			ga1 = player1.identity.energy*4 + player1.identity.intelligence*2 + player1.identity.glamor*1;  //計算玩家一之傑出表現值
			return ga1;
			
		}
		else if(contest.equals("TOUR"))  //若contest為"TOUR"則進行{}內之statement
		{
			
			ga1 = player1.identity.energy*2 + player1.identity.intelligence*1 + player1.identity.glamor*4;  //計算玩家一之傑出表現值
			return ga1;
			
		}
		if(contest.equals("IDSC"))  //若contest為"IDSC"則進行{}內之statement
		{
			
			ga1 = player1.identity.energy*2 + player1.identity.intelligence*1 + player1.identity.glamor*3;  //計算玩家一之傑出表現值
			return ga1;
			
		}
		if(contest.equals("FMSC"))  //若contest為"FMSC"則進行{}內之statement
		{
		
			ga1 = player1.identity.energy*1 + player1.identity.intelligence*4 ;  //計算玩家一之傑出表現值
			
			return ga1;
			
		}
		return ga1;
	}
	
	
	public static int Ga2(String contest, PLAYER player2){   ////////計算玩家二的傑出表現值
		//int ga2=0;
	
		if(contest.equals("ICSC"))//若contest為"ICSC"則進行{}內之statement
		{
			
			ga2 = player2.identity.energy*2 + player2.identity.intelligence*4 + player2.identity.glamor*1;  //計算玩家二之傑出表現值
			return ga2;

		}
		else if(contest.equals("BOWL"))  //若contest為"BOWL"則進行{}內之statement
		{
			
			ga2 = player2.identity.energy*4 + player2.identity.intelligence*2 + player2.identity.glamor*1;  //計算玩家二之傑出表現值
			return ga2;
			
		}
		else if(contest.equals("TOUR"))  //若contest為"TOUR"則進行{}內之statement
		{
			
			ga2 = player2.identity.energy*2 + player2.identity.intelligence*1 + player2.identity.glamor*4;  //計算玩家二之傑出表現值
			return ga2;
			
		}
		if(contest.equals("IDSC"))  //若contest為"IDSC"則進行{}內之statement
		{
			
			ga2 = player2.identity.energy*2 + player2.identity.intelligence*1 + player2.identity.glamor*3;  //計算玩家二之傑出表現值
			return ga2;
			
		}
		if(contest.equals("FMSC"))  //若contest為"FMSC"則進行{}內之statement
		{
			
			ga2 = player2.identity.energy*1 + player2.identity.intelligence*4 ;  //計算玩家二之傑出表現值
			return ga2;
			
		}
		return ga2;
	}
	
	
	public static void changeaftercontest(String contest, int g1, int g2, PLAYER player1, PLAYER player2){  ////////經過競賽改變能力值
	
		player1.identity.ChangeAfterContest1(contest, g1, g2);  /////依照讀取到之競賽去改變玩家一的能力值
		player2.identity.ChangeAfterContest2(contest, g1, g2);  /////依照讀取到之競賽去改變玩家二的能力值
		
	}
	
	
	public static void finaltest(PLAYER player1, PLAYER player2){  /////計算此遊戲贏家
		int totalP1 = player1.identity.energy + player1.identity.intelligence + player1.identity.glamor + player1.identity.victoryrecord*60;  //依造"芥末日審判方程式"計算出玩家一的芥末審判值
		int totalP2 = player2.identity.energy + player2.identity.intelligence + player2.identity.glamor + player2.identity.victoryrecord*60;  //依造"芥末日審判方程式"計算出玩家一的芥末審判值
		System.out.println("玩家一的芥末審判值為 "+totalP1);
		System.out.println("玩家二的芥末審判值為 "+totalP2);
		//以下判斷何者為贏家
		if(totalP1>totalP2){
			System.out.println("這場遊戲的贏家是玩家一 "+player1.identity.playername);
			finalwinner = "Hero- "+player1.identity.playername;
			System.out.println("恭喜您成為\"芥末日英雄\"!");
			}		
		else if(totalP1<totalP2){
			System.out.println("這場遊戲的贏家是玩家二 "+player2.identity.playername);
			finalwinner = "Hero- "+player2.identity.intelligence;
			System.out.println("恭喜您成為\"芥末日英雄\"!");
		}
		else{
			finalwinner = "Tie Game";
			System.out.println("這場比賽玩家一 "+player1.identity.playername+" 和玩家二 "+player2.identity.playername+" 平手");
		}
	}
	
	
}