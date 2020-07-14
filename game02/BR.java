import java.util.Scanner;


public class BR extends Identity{
	public String winner;
	
	public BR(String eachplayername, String eachcharacter){
		super(eachplayername, eachcharacter, 80, 100, 70, 0);      /////繼承Identity.java的constructor
	}
	
	
	int SLP2=4;
	int STY2=8;
	int CLH2=4;
	int PTY2=2;
	int NRH2=2;
	int SGP2=8;
	int BRN2=1; 
	
	
	public void Input(){        /////印出可進行的活動列表
	
		System.out.println("玩家 "+this.playername+"您好!");
		System.out.println("以下為您當前可進行的活動 :");
		if(SLP2>=1)
		System.out.println("SLP 睡覺");//若variable"SLP1">=1則顯示此句
		if(STY2>=1)
		System.out.println("STY 讀原文書");//若variable"STY1">=1則顯示此句
		if(CLH2>=1)
		System.out.println("CLH 置裝買衣服");//若variable"CLH1">=1則顯示此句
		if(PTY2>=1)
		System.out.println("PTY 吃家聚");//若variable"PTY1">=1則顯示此句
		if(NRH2>=1)
		System.out.println("NRH 夜衝");//若variable"NRH1">=1則顯示此句
		if(SGP2>=1)
		System.out.println("SGP 宿舍讀書會");//若variable"SGP1">=1則顯示此句
		if(BRN2>=1)
		System.out.println("BRN 怒吼");//若variable"BRN1">=1則顯示此句
		System.out.println("請輸入您想進行的活動之活動代號");
				
	}
	 ////////////重新設定選擇活動條件
	public void Reset(){
		if(SLP2<= 0-50)
		SLP2 += 100;
		if(STY2<= 0-50)
		STY2 += 100;
		if(CLH2<= 0-50)
		CLH2 += 100;
		if(PTY2<= 0-50)
		PTY2 += 100;
		if(NRH2<= 0-50)
		NRH2 += 100;
		if(SGP2<= 0-50)
		SGP2 += 100;
		if(BRN2<= 0-50)
		BRN2 += 100;		
	}
		
	public void Activity1(String act1){	  /////////依造玩家一輸入之活動代號產生該活動所造成之個人能力值的影響
				
		if(act1.equals("SLP")){
			System.out.println("您選擇了 SLP 睡覺 ");
			this.setLittleHighEnergy();
			SLP2 -= 1;
			
		}
		else if(act1.equals("STY")){
			System.out.println("您選擇了 STY 讀原文書 ");
			this.setSuperHighIntelligence();
			STY2 -= 1;
		}	
		else if(act1.equals("CLH")){
			System.out.println("您選擇了 CLH 置裝買衣服 ");
			this.setHighGlamor();
			CLH2 -= 1;
		}		
		else if(act1.equals("PTY")){	
			System.out.println("您選擇了 PTY 吃家聚 ");
			this.setLittleHighEnergy();
			this.setLittleDownIntelligence();
			this.setLittleHighGlamor();
			PTY2 -= 1;
		}		
		else if(act1.equals("NRH")){	
			System.out.println("您選擇了 NRH 夜衝 ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();
			NRH2 -= 1;
		}
		else if(act1.equals("SGP")){
			System.out.println("您選擇了 SGP 宿舍讀書會 ");
			this.setDownEnergy();
			this.setHighIntelligence();
			SGP2 -= 1;
		}
		else if(act1.equals("BRN")){	
			System.out.println("您選擇了 BRN 怒吼 ");
			this.setSuperHighEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();	
			BRN2 -= 1;
		}
		else{
			System.out.println("您輸入錯誤的活動代號，請重新輸入");
			Activity1(act1);		
		}
	}
	
	
	
	public void Activity2(String act2){	   ///////////依造玩家二輸入之活動代號產生該活動所造成之個人能力值的影響
				
	
		if(act2.equals("SLP")){
			System.out.println("您選擇了 SLP 睡覺 ");
			this.setLittleHighEnergy();
			SLP2 -= 1;
			
		}
		else if(act2.equals("STY")){
			System.out.println("您選擇了 STY 讀原文書 ");
			this.setSuperHighIntelligence();
			STY2 -= 1;
		}	
		else if(act2.equals("CLH")){
			System.out.println("您選擇了 CLH 置裝買衣服 ");
			this.setHighGlamor();
			CLH2 -= 1;
		}		
		else if(act2.equals("PTY")){	
			System.out.println("您選擇了 PTY 吃家聚 ");
			this.setLittleHighEnergy();
			this.setLittleDownIntelligence();
			this.setLittleHighGlamor();
			PTY2 -= 1;
		}		
		else if(act2.equals("NRH")){	
			System.out.println("您選擇了 NRH 夜衝 ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();
			NRH2 -= 1;
		}
		else if(act2.equals("SGP")){
			System.out.println("您選擇了 SGP 宿舍讀書會 ");
			this.setDownEnergy();
			this.setHighIntelligence();
			SGP2 -= 1;
		}
		else if(act2.equals("BRN")){	
			System.out.println("您選擇了 BRN 怒吼 ");
			this.setSuperHighEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();	
			BRN2 -= 1;
		}
		else{
			System.out.println("您輸入錯誤的活動代號，請重新輸入");
			Activity2(act2);		
		}
	}
	
	
	
	public void Event1(String event, PLAYER player2){    //////////依照讀取之事件代號產生該活動所造成之個人能力值的影響
		if(event.equals("PWF")) //若event為"PWF"則進行{}內之statement
		{
			this.setSuperDownEnergy();						
			SGP2 -= 100;//使玩家一下一回合無法進行"SGP 宿舍讀書會"
		}
		else if(event.equals("ERQ"))//若event為"ERQ"則進行{}內之statement
		{
			this.setDownIntelligence();
			SLP2 -= 100;
		}
		else if(event.equals("LOL"))//若event為"LOL"則進行{}內之statement
		{
			this.setSuperDownGlamor();
		}
		else if(event.equals("TYP"))//若event為"TYP"則進行{}內之statement
		{
			this.setHighIntelligence();
			CLH2 -= 100;//使玩家一下一回合無法進行"CLH 置裝買衣服"
			NRH2 -= 100;//使玩家一下一回合無法進行"NRH 夜衝"
		}
		else if(event.equals("EXC"))//若event為"EXC"則進行{}內之statement
		{
			this.energy=player2.identity.energy;
			this.intelligence=player2.identity.intelligence;
			this.glamor=player2.identity.glamor;
		}
		else if(event.equals("EOW"))//若event為"EOW"則進行{}內之statement
		{
			this.setSuperSuperDownEnergy();
			this.setDownIntelligence();
			this.setSuperSuperDownGlamor();
			STY2 -= 100;//使玩家一下一回合無法進行"STY 讀原文書"
			CLH2 -= 100;//使玩家一下一回合無法進行"CLH 置裝買衣服"
			PTY2 -= 100;//使玩家一下一回合無法進行"PTY 吃家聚"
			SGP2 -= 100;//使玩家一下一回合無法進行"SGP 宿舍讀書會"
		}
	
	
	}
	
	public void Event2(String event, PLAYER player1){    //////////依照讀取之事件代號產生該活動所造成之個人能力值的影響
		if(event.equals("PWF")) //若event為"PWF"則進行{}內之statement
		{
			this.setSuperDownEnergy();						
			SGP2 -= 100;//使玩家二下一回合無法進行"SGP 宿舍讀書會"
		}
		else if(event.equals("ERQ"))//若event為"ERQ"則進行{}內之statement
		{
			this.setDownIntelligence();
			SLP2 -= 100;
		}
		else if(event.equals("LOL"))//若event為"LOL"則進行{}內之statement
		{
			this.setSuperDownGlamor();
		}
		else if(event.equals("TYP"))//若event為"TYP"則進行{}內之statement
		{
			this.setHighIntelligence();
			CLH2 -= 100;//使玩家二下一回合無法進行"CLH 置裝買衣服"
			NRH2 -= 100;//使玩家二下一回合無法進行"NRH　夜衝"
		}
		else if(event.equals("EXC"))//若event為"EXC"則進行{}內之statement
		{
			this.energy=player1.identity.energy;
			this.intelligence=player1.identity.intelligence;
			this.glamor=player1.identity.glamor;
		}
		else if(event.equals("EOW"))//若event為"EOW"則進行{}內之statement
		{
			this.setSuperSuperDownEnergy();
			this.setDownIntelligence();
			this.setSuperSuperDownGlamor();
			STY2 -= 100;//使玩家二下一回合無法進行"STY 讀原文書"
			CLH2 -= 100;//使玩家二下一回合無法進行"CLH 置裝買衣服"
			PTY2 -= 100;//使玩家二下一回合無法進行"PTY 吃家聚"
			SGP2 -= 100;//使玩家二下一回合無法進行"SGP 宿舍讀書會"
		}
	
	
	}

}