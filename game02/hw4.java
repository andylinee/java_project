import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class hw4{

	public static void main(String args[]){
		//讀取event.txt及contest.txt兩個檔案 
		try{
			
			BufferedReader inputStream1 = new BufferedReader(new FileReader("event.txt"));
			String event=inputStream1.readLine();///////////////逐行讀取event.txt內的資料
			BufferedReader inputStream2 = new BufferedReader(new FileReader("contest.txt"));
			String contest=inputStream2.readLine();///////////逐行讀取contest.txt內的資料
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("log.txt"));///////////輸出於log.txt
			String n1, n2;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("歡迎來到\"電機大一人生 之 芥末日群雄並起\"");
			System.out.println("請輸入玩家一的角色名稱");
			n1=keyboard.next();
			PLAYER player1 = new PLAYER(n1);////////////////新增玩家一player1為PLAYER class中一個新的object
			System.out.println("玩家一為: "+n1);
			System.out.println("請輸入玩家二的角色名稱");
			n2=keyboard.next();
			PLAYER player2 = new PLAYER(n2);////////////////新增玩家二player2為PLAYER class中一個新的object
			System.out.println("玩家二為: "+n2);
			
			String c1, c2;
			System.out.println("請玩家一選擇以下其中一種為您的角色身分名稱，並輸入其對應編號");
			System.out.println("HK 宅神");
			System.out.println("BR 卷者");
			System.out.println("PB 玩咖");
			c1=keyboard.next();
			
			if(c1.equals("HK"))///////////////若玩家一輸入的身分為HK則進行以下{}內之statements
			{
				player1.setIdentity(new HK(n1, c1));/////////////利用up-casting的方法使player1為一個HK的object
				System.out.println("您選擇了 HK 宅神");
			}	
			
			else if(c1.equals("BR"))///////////////若玩家一輸入的身分為BR則進行以下{}內之statements
			{
				player1.setIdentity(new BR(n1, c1));/////////////利用up-casting的方法使player1為一個BR的object
				System.out.println("您選擇了 BR 卷者");
			}	
			
			else if(c1.equals("PB"))///////////////若玩家一輸入的身分為PB則進行以下{}內之statements
			{
				player1.setIdentity(new PB(n1, c1));/////////////利用up-casting的方法使player1為一個PB的object
				System.out.println("您選擇了 PB 玩咖");
			}	
			
			
			
			System.out.println("請玩家二選擇以下其中一種為您的角色身分名稱，並輸入其對應編號");
			System.out.println("HK 宅神");
			System.out.println("BR 卷者");
			System.out.println("PB 玩咖");
			c2=keyboard.next();
			
			if(c2.equals("HK"))///////////////若玩家二輸入的身分為HK則進行以下{}內之statements
			{
				player2.setIdentity(new HK(n2, c2));/////////////利用up-casting的方法使player2為一個HK的object
				System.out.println("您選擇了 HK 宅神");
			}	
			
			else if(c2.equals("BR"))///////////////若玩家二輸入的身分為BR則進行以下{}內之statements
			{
				player2.setIdentity(new BR(n2, c2));/////////////利用up-casting的方法使player2為一個BR的object
				System.out.println("您選擇了 BR 卷者");
			}	
			
			else if(c2.equals("PB"))///////////////若玩家二輸入的身分為PB則進行以下{}內之statements
			{
				player2.setIdentity(new PB(n2, c2));/////////////利用up-casting的方法使player2為一個PB的object
				System.out.println("您選擇了 PB 玩咖");
			}	
				
			
			PLAYER.print(c1, c2, n1, n2, player1, player2);///////////印出此時玩家一及玩家二的角色名稱,身分名稱,各項能力值及勝利紀錄
			//////以下輸出到log.txt
			outputStream.println("Game Start");
			outputStream.println("P1-"+player1.identity.playername+"["+c1+","+player1.identity.energy+","+player1.identity.intelligence+","+player1.identity.glamor+","+player1.identity.victoryrecord+"]");
			outputStream.println("P2-"+player2.identity.playername+"["+c2+","+player2.identity.energy+","+player2.identity.intelligence+","+player2.identity.glamor+","+player2.identity.victoryrecord+"]");
		
			//以下宣告此程式需要用到之變數
			int one;
			
			
		    //以下為5回合的遊戲(5次迴圈)
			for(one=1;one<=5;one++){
				String x = null;//initialization
				if(one==1)
					x="一";
				else if(one==2)
					x="二";
				else if(one==3)
					x="三";
				else if(one==4)
					x="四";
				else if(one==5)
					x="五";
				System.out.println("此遊戲共有五回合");
				System.out.println("現在第"+x+"回合開始!");
				
				int next;
				PLAYER.stage1(player1, player2, c1, c2);  //第一階段:活動階段
	
				PLAYER.stage2(event, player1, player2, c1, c2);  //第二階段:事件階段
				event = inputStream1.readLine();

				PLAYER.stage3(contest, player1, player2, c1, c2);  //第三階段:競賽階段
				contest = inputStream2.readLine();
				
				//////以下輸出到log.txt
				outputStream.println("Playing-"+one);
				outputStream.println("P1-"+player1.identity.playername+"["+PLAYER.act1_1+","+PLAYER.act1_2+"]");
				outputStream.println("P2-"+player2.identity.playername+"["+PLAYER.act2_1+","+PLAYER.act2_2+"]");
				outputStream.println("Event-"+event);
				outputStream.println("Contest-"+contest);
				outputStream.println(PLAYER.winner);
				outputStream.println("P1-"+player1.identity.playername+"["+c1+","+player1.identity.energy+","+player1.identity.intelligence+","+player1.identity.glamor+","+player1.identity.victoryrecord+"]");
				outputStream.println("P2-"+player2.identity.playername+"["+c2+","+player2.identity.energy+","+player2.identity.intelligence+","+player2.identity.glamor+","+player2.identity.victoryrecord+"]");
				
			
			}	
			
		
			PLAYER.finaltest(player1, player2);  //藉由"芥末日審判方程式"來計算出此次遊戲的贏家為"芥末日英雄"
			//////以下輸出到log.txt
			outputStream.println("Game Set");
			outputStream.println("P1-"+player1.identity.playername+"["+c1+","+player1.identity.energy+","+player1.identity.intelligence+","+player1.identity.glamor+","+player1.identity.victoryrecord+"]");
			outputStream.println("P2-"+player2.identity.playername+"["+c2+","+player2.identity.energy+","+player2.identity.intelligence+","+player2.identity.glamor+","+player2.identity.victoryrecord+"]");
			outputStream.println(PLAYER.finalwinner);
		
			inputStream1.close();
			inputStream2.close();
			outputStream.close();
		}
		catch(IOException e)//若無法讀取檔案則進行以下{}內之statement
			{
				System.out.println("Problem opening files.");
				System.out.println("Error reading from event.txt and contest.txt");
			}
			
			
	}
}	