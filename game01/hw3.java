import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class hw3{

	public static void main(String args[]){
		//讀取event.txt及contest.txt兩個檔案 
		try
		{
			
			BufferedReader inputStream1 = new BufferedReader(new FileReader("event.txt"));
			String event=inputStream1.readLine();//逐行讀取event.txt內的資料
			BufferedReader inputStream2 = new BufferedReader(new FileReader("contest.txt"));
			String contest=inputStream2.readLine();//逐行讀取event.txt內的資料
			String n1, n2;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("歡迎來到\"電機大一人生 之 全能格鬥\"");
			System.out.println("請輸入玩家一的角色名稱");
			n1=keyboard.next();
			PLAYER player1 = new PLAYER(n1);//建立新object "player1"為玩家一
			System.out.println("玩家一為: "+player1.playername);
			System.out.println("請輸入玩家二的角色名稱");
			n2=keyboard.next();
			PLAYER player2 = new PLAYER(n2);//建立新object "player2"為玩家二
			System.out.println("玩家二為: "+player2.playername);
		
			//以下宣告此程式需要用到之變數
			int one, next;
			int SLP1=0;
			int STY1=0;
			int CLH1=0;
			int PTY1=0;
			int NRH1=0;
			int SGP1=0;
			int BRN1=0; 
			int SLP2=0; 
			int STY2=0;
			int CLH2=0;
			int PTY2=0;
			int NRH2=0;
			int SGP2=0;
			int BRN2=0;
			 
			
			
		    //以下為4回合的遊戲(4次迴圈)
			for(one=0;one<=3;one++){
				String x = null;//initialization
				if(one==0)
				x="一";
				else if(one==1)
				x="二";
				else if(one==2)
				x="三";
				else if(one==3)
				x="四";
				System.out.println("此遊戲共有四回合");
				System.out.println("現在第"+x+"回合開始!");
			
			
			
			
				//以下為2回合的活動階段(2次迴圈)
			
				for(next=0;next<=1;next++){
				
				  
					
					
					player1.Input1();
					player2.Input2();
		
							
					//以下顯示玩家一和玩家二經過活動後的能力值
					System.out.println("Player1 : "+player1.playername);
					System.out.println("體力 :"+player1.energy);
					System.out.println("智力 :"+player1.intelligence);
					System.out.println("魅力 :"+player1.glamor);
					System.out.println("勝利記錄 :"+player1.victoryrecord);
					System.out.println("Player2 : "+player2.playername);
					System.out.println("體力 :"+player2.energy);
					System.out.println("智力 :"+player2.intelligence);
					System.out.println("魅力 :"+player2.glamor);
					System.out.println("勝利記錄 :"+player2.victoryrecord);
				}
			
				
				//以下為事件階段
				
				if(event.equals("PWF")) //若event為"PWF"則進行{}內之statement
				{
					System.out.println("即將發生\"PWF 停電\"");
					player1.setSuperDownEnergy();
					player2.setSuperDownEnergy();						
					SGP1 -=1;//使玩家一下一回合無法進行"SGP 宿舍讀書會"
					SGP2 -=1;//使玩家二下一回合無法進行"SGP 宿舍讀書會"
				}
				else if(event.equals("ERQ"))//若event為"ERQ"則進行{}內之statement
				{
					System.out.println("即將發生\"ERQ 地震\"");
					player1.setDownIntelligence();
					player2.setDownIntelligence();
					SLP1 -=1;//使玩家一下一回合無法進行"SLP 睡覺"
					SLP2 -=1;//使玩家二下一回合無法進行"SLP 睡覺"
				}
				else if(event.equals("LOL"))//若event為"LOL"則進行{}內之statement
				{
					System.out.println("即將舉行\"LOL LOL大賽\"");
					player1.setSuperDownGlamor();
					player2.setSuperDownGlamor();
				}
				else if(event.equals("TYP"))//若event為"TYP"則進行{}內之statement
				{
					System.out.println("即將發生\"TYP 颱風天\"");
					player1.setHalfEnergy();
					player2.setHalfEnergy();
					CLH1 -=1;//使玩家一下一回合無法進行"CLH 置裝買衣服"
					NRH1 -=1;//使玩家一下一回合無法進行"夜衝"
					CLH2 -=1;//使玩家二下一回合無法進行"CLH 置裝買衣服"
					NRH2 -=1;//使玩家二下一回合無法進行"夜衝"
				}
				//以下顯示玩家一和玩家二經過事件影響後的能力值
				System.out.println("Player1 : "+player1.playername);
				System.out.println("體力 :"+player1.energy);
				System.out.println("智力 :"+player1.intelligence);
				System.out.println("魅力 :"+player1.glamor);
		        System.out.println("勝利記錄 :"+player1.victoryrecord);
				System.out.println("Player2 : "+player2.playername);
				System.out.println("體力 :"+player2.energy);
				System.out.println("智力 :"+player2.intelligence);
				System.out.println("魅力 :"+player2.glamor);
				System.out.println("勝利記錄 :"+player2.victoryrecord);		
				event = inputStream1.readLine();
				
				//以下為競賽階段
				if(contest.equals("ICSC"))//若contest為"ICSC"則進行{}內之statement
					{
						System.out.println("即將進行\"計概考試\"");
						int ga1 = player1.energy*1 + player1.intelligence*4 + player1.glamor*2;//計算玩家一之傑出表現值
						int ga2 = player2.energy*1 + player2.intelligence*4 + player2.glamor*2;//計算玩家二之傑出表現值
						//以下判斷何者獲勝，statements為勝敗方所造成之影響
						if(ga1>ga2)
						{
							player1.setDownEnergy();
							player1.setHighIntelligence();
							player1.setHighVictoryRecord();
							player2.setDownEnergy();
						}
						else if(ga1<ga2)
						{
							player2.setDownEnergy();
							player2.setHighIntelligence();
							player2.setHighVictoryRecord();
							player1.setDownEnergy();
						}
					}
				else if(contest.equals("BOWL"))//若contest為"BOWL"則進行{}內之statement
					{
						System.out.println("即將進行\"打保齡球\"");
						int ga1 = player1.energy*4 + player1.intelligence*2 + player1.glamor*1;//計算玩家一之傑出表現值
						int ga2 = player2.energy*4 + player2.intelligence*2 + player2.glamor*1;//計算玩家二之傑出表現值
						//以下判斷何者獲勝，statements為勝敗方所造成之影響
						if(ga1>ga2)
						{
							player1.setDownEnergy();
							player1.setSuperHighGlamor();
							player1.setHighVictoryRecord();
							player2.setDownEnergy();
						}
						else if(ga1<ga2)
						{
							player2.setDownEnergy();
							player2.setSuperHighGlamor();
							player2.setHighVictoryRecord();
							player1.setDownEnergy();
						}	
					}
				else if(contest.equals("TOUR"))//若contest為"TOUR"則進行{}內之statement
					{
						System.out.println("即將進行\"班際出遊\"");
						int ga1 = player1.energy*2 + player1.intelligence*1 + player1.glamor*4;//計算玩家一之傑出表現值
						int ga2 = player2.energy*2 + player2.intelligence*1 + player2.glamor*4;//計算玩家二之傑出表現值
						//以下判斷何者獲勝，statements為勝敗方所造成之影響
						if(ga1>ga2)
						{
							player1.setHighGlamor();
							player1.setHighVictoryRecord();
							player2.setDownEnergy();
						}
						else if(ga1<ga2)
						{
							player2.setHighGlamor();
							player2.setHighVictoryRecord();
							player1.setDownEnergy();
						}
					}
					System.out.println("Player1 : "+player1.playername);
					System.out.println("體力 :"+player1.energy);
					System.out.println("智力 :"+player1.intelligence);
					System.out.println("魅力 :"+player1.glamor);
					System.out.println("勝利記錄 :"+player1.victoryrecord);
					System.out.println("Player2 : "+player2.playername);
					System.out.println("體力 :"+player2.energy);
					System.out.println("智力 :"+player2.intelligence);
					System.out.println("魅力 :"+player2.glamor);
					System.out.println("勝利記錄 :"+player2.victoryrecord);		
					contest = inputStream2.readLine();
			}	
				int totalP1 = player1.energy + player1.intelligence + player1.glamor + player1.victoryrecord*5;//依造"成就電機霸主方程式"計算出玩家一的總積分
		        int totalP2 = player2.energy + player2.intelligence + player2.glamor + player2.victoryrecord*5;//依造"成就電機霸主方程式"計算出玩家一的總積分
				System.out.println("玩家一的總積分為 "+totalP1);
				System.out.println("玩家二的總積分為 "+totalP2);
				//以下判斷何者為贏家
				if(totalP1>totalP2)
					System.out.println("這場遊戲的贏家是玩家一 "+player1.playername);
				else if(totalP1<totalP2)
					System.out.println("這場遊戲的贏家是玩家二 "+player2.playername);
				else
					System.out.println("這場比賽玩家一和玩家二平手");
				
			
		
		}
			
		catch(FileNotFoundException e)//若找不到檔案則進行以下{}內之statement
			{
				System.out.println("Problem opening files.");
			}
		catch(IOException e)//若無法讀取檔案則進行以下{}內之statement
			{
				System.out.println("Error reading from event.txt");
			}
			
			
	}
}	