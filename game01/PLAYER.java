import java.util.Scanner;


public class PLAYER{ //�إߤ@��PLAYER��class �A�@�H�U��constructor
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
	
	//�H�U�إߦbmain class�ݭn�Ψ줧methods
	
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
	
		System.out.println("���a�@ "+this.playername+"�z�n!");
		System.out.println("�H�U���z��e�i�i�檺���� :");
		if(SLP1==0)
		System.out.println("SLP ��ı");//�Yvariable"SLP1"=0�h��ܦ��y
		if(STY1==0)
		System.out.println("STY Ū����");//�Yvariable"STY1"=0�h��ܦ��y
		if(CLH1==0)
		System.out.println("CLH �m�˶R��A");//�Yvariable"CLH1"=0�h��ܦ��y
		if(PTY1==0)
		System.out.println("PTY �Y�a�E");//�Yvariable"PTY1"=0�h��ܦ��y
		if(NRH1==0)
		System.out.println("NRH �]��");//�Yvariable"NRH1"=0�h��ܦ��y
		if(SGP1==0)
		System.out.println("SGP �J��Ū�ѷ|");//�Yvariable"SGP1"=0�h��ܦ��y
		if(BRN1==0)
		System.out.println("BRN ��q");//�Yvariable"BRN1"=0�h��ܦ��y
		System.out.println("�п�J�z�Q�i�檺���ʤ����ʥN��");
				
		
		Scanner scannerObject = new Scanner(System.in);
		String act1 = scannerObject.next();//�إ߷sobject"act1"�����a�@��J�����ʥN��
				
		//�H�U�̳y���a�@��J�����ʥN�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		if(act1.equals("SLP")){
			System.out.println("�z��ܤF SLP ��ı ");
			this.setSuperHighEnergy();
			this.setDownGlamor();
		}
		else if(act1.equals("STY")){
			System.out.println("�z��ܤF STY Ū���� ");
			this.setSuperHighIntelligence();
			this.setDownEnergy();
		}	
		else if(act1.equals("CLH")){
			System.out.println("�z��ܤF CLH �m�˶R��A ");
			this.setSuperHighGlamor();
			this.setLittleDownIntelligence();
		}		
		else if(act1.equals("PTY")){	
			System.out.println("�z��ܤF PTY �Y�a�E ");
			this.setHighEnergy();
			this.setLittleHighGlamor();
		}		
		else if(act1.equals("NRH")){	
			System.out.println("�z��ܤF NRH �]�� ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperSuperHighGlamor();
		}
		else if(act1.equals("SGP")){
			System.out.println("�z��ܤF SGP �J��Ū�ѷ| ");
			this.setDownEnergy();
			this.setSuperHighIntelligence();
		}
		else if(act1.equals("BRN")){	
			System.out.println("�z��ܤF BRN ��q ");
			this.setSuperHighEnergy();
			this.setHighIntelligence();
			this.setLittleHighGlamor();	
			BRN1 -= 1;
		}
		else{
			System.out.println("�z��J���~�����ʥN���A�Э��s��J");
			Input1();		
		}
	}
	
	public void Input2(){
		System.out.println("���a�G "+this.playername+"�z�n!");			
		System.out.println("�H�U���z��e�i�i�檺���� :");
		if(SLP2==0)
		System.out.println("SLP ��ı");//�Yvariable"SLP2"=0�h��ܦ��y
		if(STY2==0)
		System.out.println("STY Ū����");//�Yvariable"STY2"=0�h��ܦ��y
		if(CLH2==0)
		System.out.println("CLH �m�˶R��A");//�Yvariable"CLH2"=0�h��ܦ��y
		if(PTY2==0)
		System.out.println("PTY �Y�a�E");//�Yvariable"FTY2"=0�h��ܦ��y
		if(NRH2==0)
		System.out.println("NRH �]��");//�Yvariable"NRH2"=0�h��ܦ��y
		if(SGP2==0)
		System.out.println("SGP �J��Ū�ѷ|");//�Yvariable"SGP2"=0�h��ܦ��y
		if(BRN2==0)
		System.out.println("BRN ��q");//�Yvariable"BRN2"=0�h��ܦ��y
		System.out.println("�п�J�z�Q�i�檺���ʤ����ʥN��");
				
		Scanner scannerObject = new Scanner(System.in);
		String act2 = scannerObject.next();//�إ߷sobject"act2"�����a�G��J�����ʥN��
		
		//�H�U�̳y���a�G��J�����ʥN�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		if(act2.equals("SLP")){
			System.out.println("�z��ܤF SLP ��ı ");
			this.setSuperHighEnergy();
			this.setDownGlamor();
		}
		else if(act2.equals("STY")){
			System.out.println("�z��ܤF STY Ū���� ");
			this.setSuperHighIntelligence();
			this.setDownEnergy();
		}	
		else if(act2.equals("CLH")){
			System.out.println("�z��ܤF CLH �m�˶R��A ");
			this.setSuperHighGlamor();
			this.setLittleDownIntelligence();
		}		
		else if(act2.equals("PTY")){	
			System.out.println("�z��ܤF PTY �Y�a�E ");
			this.setHighEnergy();
			this.setLittleHighGlamor();
		}		
		else if(act2.equals("NRH")){	
			System.out.println("�z��ܤF NRH �]�� ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperSuperHighGlamor();
		}
		else if(act2.equals("SGP")){
			System.out.println("�z��ܤF SGP �J��Ū�ѷ| ");
			this.setDownEnergy();
			this.setSuperHighIntelligence();
		}
		else if(act2.equals("BRN")){	
			System.out.println("�z��ܤF BRN ��q ");
			this.setSuperHighEnergy();
			this.setHighIntelligence();
			this.setLittleHighGlamor();	
			BRN2 -=1;
		}
		else{
			System.out.println("�z��J���~�����ʥN���A�Э��s��J");
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