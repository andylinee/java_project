import java.util.Scanner;


public class PB extends Identity{
	public String winner;
	
	public PB(String eachplayername, String eachcharacter){
		super(eachplayername, eachcharacter, 110, 60, 80, 0);    /////繼承Identity.java的constructor
	
	}
	
	int SLP3=2;
	int STY3=4;
	int CLH3=8;
	int PTY3=2;
	int NRH3=4;
	int SGP3=2;
	int BRN3=1; 
	
	
	
	public void Input(){         /////印出可進行的活動列表
	
		System.out.println("玩家 "+this.playername+"您好!");
		System.out.println("以下為您當前可進行的活動 :");
		if(SLP3>=1)
		System.out.println("SLP 睡覺");//若variable"SLP1">=1則顯示此句
		if(STY3>=1)
		System.out.println("STY 讀原文書");//若variable"STY1">=1則顯示此句
		if(CLH3>=1)
		System.out.println("CLH 置裝買衣服");//若variable"CLH1">=1則顯示此句
		if(PTY3>=1)
		System.out.println("PTY 吃家聚");//若variable"PTY1">=1則顯示此句
		if(NRH3>=1)
		System.out.println("NRH 夜衝");//若variable"NRH1">=1則顯示此句
		if(SGP3>=1)
		System.out.println("SGP 宿舍讀書會");//若variable"SGP1">=1則顯示此句
		if(BRN3>=1)
		System.out.println("BRN 怒吼");//若variable"BRN1">=1則顯示此句
		System.out.println("請輸入您想進行的活動之活動代號");
				
	}
	public void Reset(){            ////////////重新設定選擇活動條件
		if(SLP3<= 0-50)
		SLP3 += 100;
		if(STY3<= 0-50)
		STY3 += 100;
		if(CLH3<= 0-50)
		CLH3 += 100;
		if(PTY3<= 0-50)
		PTY3 += 100;
		if(NRH3<= 0-50)
		NRH3 += 100;
		if(SGP3<= 0-50)
		SGP3 += 100;
		if(BRN3<= 0-50)
		BRN3 += 100;		
	}
	public void Activity1(String act1){         /////////依造玩家一輸入之活動代號產生該活動所造成之個人能力值的影響
		
		if(act1.equals("SLP")){
			System.out.println("您選擇了 SLP 睡覺 ");
			this.setLittleHighEnergy();
			SLP3 -= 1;
			
		}
		else if(act1.equals("STY")){
			System.out.println("您選擇了 STY 讀原文書 ");
			this.setHighIntelligence();
			STY3 -= 1;
		}	
		else if(act1.equals("CLH")){
			System.out.println("您選擇了 CLH 置裝買衣服 ");
			this.setSuperHighGlamor();
			CLH3 -= 1;
			
		}		
		else if(act1.equals("PTY")){	
			System.out.println("您選擇了 PTY 吃家聚 ");
			this.setHighEnergy();
			this.setDownIntelligence();
			this.setHighGlamor();
			PTY3 -= 1;
		}		
		else if(act1.equals("NRH")){	
			System.out.println("您選擇了 NRH 夜衝 ");
			this.setSuperDownEnergy();
			this.setLittleHighIntelligence();
			this.setSuperSuperHighGlamor();
			NRH3 -= 1;
		}
		else if(act1.equals("SGP")){
			System.out.println("您選擇了 SGP 宿舍讀書會 ");
			this.setSuperDownEnergy();
			this.setHighIntelligence();
			SGP3 -= 1;
		}
		else if(act1.equals("BRN")){	
			System.out.println("您選擇了 BRN 怒吼 ");
			this.setSuperHighEnergy();
			this.setSuperHighIntelligence();
			this.setHighGlamor();	
			BRN3 -= 1;
		}
		else{
			System.out.println("您輸入錯誤的活動代號，請重新輸入");
			Activity1(act1);		
		}
	}
	
	
	
	public void Activity2(String act2){          /////////依造玩家二輸入之活動代號產生該活動所造成之個人能力值的影響
		
		if(act2.equals("SLP")){
			System.out.println("您選擇了 SLP 睡覺 ");
			this.setLittleHighEnergy();
			SLP3 -= 1;
			
		}
		else if(act2.equals("STY")){
			System.out.println("您選擇了 STY 讀原文書 ");
			this.setHighIntelligence();
			STY3 -= 1;
		}	
		else if(act2.equals("CLH")){
			System.out.println("您選擇了 CLH 置裝買衣服 ");
			this.setSuperHighGlamor();
			CLH3 -= 1;
			
		}		
		else if(act2.equals("PTY")){	
			System.out.println("您選擇了 PTY 吃家聚 ");
			this.setHighEnergy();
			this.setDownIntelligence();
			this.setHighGlamor();
			PTY3 -= 1;
		}		
		else if(act2.equals("NRH")){	
			System.out.println("您選擇了 NRH 夜衝 ");
			this.setSuperDownEnergy();
			this.setLittleHighIntelligence();
			this.setSuperSuperHighGlamor();
			NRH3 -= 1;
		}
		else if(act2.equals("SGP")){
			System.out.println("您選擇了 SGP 宿舍讀書會 ");
			this.setSuperDownEnergy();
			this.setHighIntelligence();
			SGP3 -= 1;
		}
		else if(act2.equals("BRN")){	
			System.out.println("您選擇了 BRN 怒吼 ");
			this.setSuperHighEnergy();
			this.setSuperHighIntelligence();
			this.setHighGlamor();	
			BRN3 -= 1;
		}
		else{
			System.out.println("您輸入錯誤的活動代號，請重新輸入");
			Activity2(act2);		
		}
	}
	
	
	
	public void Event1(String event, PLAYER player2){  //////////依照讀取之事件代號產生該活動所造成之個人能力值的影響
		if(event.equals("PWF")) //若event為"PWF"則進行{}內之statement
		{
			this.setDownEnergy();						
			SGP3 -= 100;//使玩家一下一回合無法進行"SGP 宿舍讀書會"
		}
		else if(event.equals("ERQ"))//若event為"ERQ"則進行{}內之statement
		{
			this.setDownIntelligence();
			SLP3 -= 100;//使玩家二下一回合無法進行"SLP 睡覺"
		}
		else if(event.equals("LOL"))//若event為"LOL"則進行{}內之statement
		{
			this.setSuperLittleDownGlamor();
		}
		else if(event.equals("TYP"))//若event為"TYP"則進行{}內之statement
		{
			this.setSuperDownEnergy();
			CLH3 -= 100;//使玩家一下一回合無法進行"CLH 置裝買衣服"
			NRH3 -= 100;//使玩家一下一回合無法進行"NRH 夜衝"
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
			this.setSuperSuperDownIntelligence();
			this.setSuperDownGlamor();
			STY3 -= 100;//使玩家一下一回合無法進行"STY 讀原文書"
			CLH3 -= 100;//使玩家一下一回合無法進行"CLH 置裝買衣服"
			PTY3 -= 100;//使玩家一下一回合無法進行"PTY 吃家聚"
			SGP3 -= 100;//使玩家一下一回合無法進行"SGP 宿舍讀書會"
		}
	
	
	}
	
	
	
	public void Event2(String event, PLAYER player1){  //////////依照讀取之事件代號產生該活動所造成之個人能力值的影響
		if(event.equals("PWF")) //若event為"PWF"則進行{}內之statement
		{
			this.setDownEnergy();						
			SGP3 -= 100;//使玩家二下一回合無法進行"SGP 宿舍讀書會"
		}
		else if(event.equals("ERQ"))//若event為"ERQ"則進行{}內之statement
		{
			this.setDownIntelligence();
			SLP3 -= 100;//使玩家二下一回合無法進行"SLP 睡覺"
		}
		else if(event.equals("LOL"))//若event為"LOL"則進行{}內之statement
		{
			this.setSuperLittleDownGlamor();
		}
		else if(event.equals("TYP"))//若event為"TYP"則進行{}內之statement
		{
			this.setSuperDownEnergy();
			CLH3 -= 100;//使玩家二下一回合無法進行"CLH 置裝買衣服"
			NRH3 -= 100;//使玩家二下一回合無法進行"NRH 夜衝"
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
			this.setSuperSuperDownIntelligence();
			this.setSuperDownGlamor();
			STY3 -= 100;//使玩家二下一回合無法進行"STY 讀原文書"
			CLH3 -= 100;//使玩家二下一回合無法進行"CLH 置裝買衣服"
			PTY3 -= 100;//使玩家二下一回合無法進行"PTY 吃家聚"
			SGP3 -= 100;//使玩家二下一回合無法進行"SGP 宿舍讀書會"
		}
	
	
	}
	
	
}