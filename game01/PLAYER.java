import java.util.Scanner;


public class PLAYER{ //建立一個PLAYER的class ，　以下為constructor
	public String playername;
	public int energy;
	public int intelligence;
	public int glamor;
	public int victoryrecord;
 
	public PLAYER(String eachplayername){
		playername = eachplayername;
		energy = 100;
		intelligence = 50;
		glamor = 50;
		victoryrecord = 0;
	}
	
	//以下建立在main class需要用到之methods
	
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
	
	public void Input1(){
	
		System.out.println("玩家一 "+this.playername+"您好!");
		System.out.println("以下為您當前可進行的活動 :");
		if(SLP1==0)
		System.out.println("SLP 睡覺");//若variable"SLP1"=0則顯示此句
		if(STY1==0)
		System.out.println("STY 讀原文書");//若variable"STY1"=0則顯示此句
		if(CLH1==0)
		System.out.println("CLH 置裝買衣服");//若variable"CLH1"=0則顯示此句
		if(PTY1==0)
		System.out.println("PTY 吃家聚");//若variable"PTY1"=0則顯示此句
		if(NRH1==0)
		System.out.println("NRH 夜衝");//若variable"NRH1"=0則顯示此句
		if(SGP1==0)
		System.out.println("SGP 宿舍讀書會");//若variable"SGP1"=0則顯示此句
		if(BRN1==0)
		System.out.println("BRN 怒吼");//若variable"BRN1"=0則顯示此句
		System.out.println("請輸入您想進行的活動之活動代號");
				
		
		Scanner scannerObject = new Scanner(System.in);
		String act1 = scannerObject.next();//建立新object"act1"為玩家一輸入之活動代號
				
		//以下依造玩家一輸入之活動代號產生該活動所造成之個人能力值的影響
		if(act1.equals("SLP")){
			System.out.println("您選擇了 SLP 睡覺 ");
			this.setSuperHighEnergy();
			this.setDownGlamor();
		}
		else if(act1.equals("STY")){
			System.out.println("您選擇了 STY 讀原文書 ");
			this.setSuperHighIntelligence();
			this.setDownEnergy();
		}	
		else if(act1.equals("CLH")){
			System.out.println("您選擇了 CLH 置裝買衣服 ");
			this.setSuperHighGlamor();
			this.setLittleDownIntelligence();
		}		
		else if(act1.equals("PTY")){	
			System.out.println("您選擇了 PTY 吃家聚 ");
			this.setHighEnergy();
			this.setLittleHighGlamor();
		}		
		else if(act1.equals("NRH")){	
			System.out.println("您選擇了 NRH 夜衝 ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperSuperHighGlamor();
		}
		else if(act1.equals("SGP")){
			System.out.println("您選擇了 SGP 宿舍讀書會 ");
			this.setDownEnergy();
			this.setSuperHighIntelligence();
		}
		else if(act1.equals("BRN")){	
			System.out.println("您選擇了 BRN 怒吼 ");
			this.setSuperHighEnergy();
			this.setHighIntelligence();
			this.setLittleHighGlamor();	
			BRN1 -= 1;
		}
		else{
			System.out.println("您輸入錯誤的活動代號，請重新輸入");
			Input1();		
		}
	}
	
	public void Input2(){
		System.out.println("玩家二 "+this.playername+"您好!");			
		System.out.println("以下為您當前可進行的活動 :");
		if(SLP2==0)
		System.out.println("SLP 睡覺");//若variable"SLP2"=0則顯示此句
		if(STY2==0)
		System.out.println("STY 讀原文書");//若variable"STY2"=0則顯示此句
		if(CLH2==0)
		System.out.println("CLH 置裝買衣服");//若variable"CLH2"=0則顯示此句
		if(PTY2==0)
		System.out.println("PTY 吃家聚");//若variable"FTY2"=0則顯示此句
		if(NRH2==0)
		System.out.println("NRH 夜衝");//若variable"NRH2"=0則顯示此句
		if(SGP2==0)
		System.out.println("SGP 宿舍讀書會");//若variable"SGP2"=0則顯示此句
		if(BRN2==0)
		System.out.println("BRN 怒吼");//若variable"BRN2"=0則顯示此句
		System.out.println("請輸入您想進行的活動之活動代號");
				
		Scanner scannerObject = new Scanner(System.in);
		String act2 = scannerObject.next();//建立新object"act2"為玩家二輸入之活動代號
		
		//以下依造玩家二輸入之活動代號產生該活動所造成之個人能力值的影響
		if(act2.equals("SLP")){
			System.out.println("您選擇了 SLP 睡覺 ");
			this.setSuperHighEnergy();
			this.setDownGlamor();
		}
		else if(act2.equals("STY")){
			System.out.println("您選擇了 STY 讀原文書 ");
			this.setSuperHighIntelligence();
			this.setDownEnergy();
		}	
		else if(act2.equals("CLH")){
			System.out.println("您選擇了 CLH 置裝買衣服 ");
			this.setSuperHighGlamor();
			this.setLittleDownIntelligence();
		}		
		else if(act2.equals("PTY")){	
			System.out.println("您選擇了 PTY 吃家聚 ");
			this.setHighEnergy();
			this.setLittleHighGlamor();
		}		
		else if(act2.equals("NRH")){	
			System.out.println("您選擇了 NRH 夜衝 ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperSuperHighGlamor();
		}
		else if(act2.equals("SGP")){
			System.out.println("您選擇了 SGP 宿舍讀書會 ");
			this.setDownEnergy();
			this.setSuperHighIntelligence();
		}
		else if(act2.equals("BRN")){	
			System.out.println("您選擇了 BRN 怒吼 ");
			this.setSuperHighEnergy();
			this.setHighIntelligence();
			this.setLittleHighGlamor();	
			BRN2 -=1;
		}
		else{
			System.out.println("您輸入錯誤的活動代號，請重新輸入");
			Input2();
		}
	}
	
	public void setSuperSuperDownEnergy(){
		this.energy -= 20;		
	}
	
	public void setSuperDownEnergy(){
		this.energy -= 10;		
	}
	
	public void setDownEnergy(){
		this.energy -= 5;	
	}
	
	public void setDownIntelligence(){
		this.intelligence -= 10;	
	}
	
	public void setSuperDownGlamor(){
		this.glamor -= 10;		
	}
	
	public void setDownGlamor(){
		this.glamor -= 5;		
	}
	
	public void setLittleDownIntelligence(){
		this.intelligence -= 5;		
	}
	
	public void setHalfEnergy(){
		this.energy = energy/2;		
	}
	
	public void setSuperSuperHighEnergy(){
		this.energy += 25;		
	}
	
	public void setSuperHighEnergy(){
		this.energy += 20;		
	}
	
	public void setLittleHighEnergy(){
		this.energy += 15;
	}
	
	public void setHighEnergy(){
		this.energy += 10;
	}
	
	public void setSuperSuperHighGlamor(){
		this.glamor += 20;	
	}
	
	public void setSuperHighGlamor(){
		this.glamor += 15;	
	}
	
	public void setHighGlamor(){
		this.glamor += 10;		
	}
	
	public void setLittleHighGlamor(){
		this.glamor += 5;		
	}
	
	public void setHighIntelligence(){
		this.intelligence += 10;		
	}
	
	
	public void setLittleHighIntelligence(){
		this.intelligence += 5;		
	}
	
	public void setSuperHighIntelligence(){
		this.intelligence += 15;	
	}
	
	public void setHighVictoryRecord(){
		this.victoryrecord += 1;
	}
	
}