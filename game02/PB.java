import java.util.Scanner;


public class PB extends Identity{
	public String winner;
	
	public PB(String eachplayername, String eachcharacter){
		super(eachplayername, eachcharacter, 110, 60, 80, 0);    /////�~��Identity.java��constructor
	
	}
	
	int SLP3=2;
	int STY3=4;
	int CLH3=8;
	int PTY3=2;
	int NRH3=4;
	int SGP3=2;
	int BRN3=1; 
	
	
	
	public void Input(){         /////�L�X�i�i�檺���ʦC��
	
		System.out.println("���a "+this.playername+"�z�n!");
		System.out.println("�H�U���z��e�i�i�檺���� :");
		if(SLP3>=1)
		System.out.println("SLP ��ı");//�Yvariable"SLP1">=1�h��ܦ��y
		if(STY3>=1)
		System.out.println("STY Ū����");//�Yvariable"STY1">=1�h��ܦ��y
		if(CLH3>=1)
		System.out.println("CLH �m�˶R��A");//�Yvariable"CLH1">=1�h��ܦ��y
		if(PTY3>=1)
		System.out.println("PTY �Y�a�E");//�Yvariable"PTY1">=1�h��ܦ��y
		if(NRH3>=1)
		System.out.println("NRH �]��");//�Yvariable"NRH1">=1�h��ܦ��y
		if(SGP3>=1)
		System.out.println("SGP �J��Ū�ѷ|");//�Yvariable"SGP1">=1�h��ܦ��y
		if(BRN3>=1)
		System.out.println("BRN ��q");//�Yvariable"BRN1">=1�h��ܦ��y
		System.out.println("�п�J�z�Q�i�檺���ʤ����ʥN��");
				
	}
	public void Reset(){            ////////////���s�]�w��ܬ��ʱ���
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
	public void Activity1(String act1){         /////////�̳y���a�@��J�����ʥN�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		
		if(act1.equals("SLP")){
			System.out.println("�z��ܤF SLP ��ı ");
			this.setLittleHighEnergy();
			SLP3 -= 1;
			
		}
		else if(act1.equals("STY")){
			System.out.println("�z��ܤF STY Ū���� ");
			this.setHighIntelligence();
			STY3 -= 1;
		}	
		else if(act1.equals("CLH")){
			System.out.println("�z��ܤF CLH �m�˶R��A ");
			this.setSuperHighGlamor();
			CLH3 -= 1;
			
		}		
		else if(act1.equals("PTY")){	
			System.out.println("�z��ܤF PTY �Y�a�E ");
			this.setHighEnergy();
			this.setDownIntelligence();
			this.setHighGlamor();
			PTY3 -= 1;
		}		
		else if(act1.equals("NRH")){	
			System.out.println("�z��ܤF NRH �]�� ");
			this.setSuperDownEnergy();
			this.setLittleHighIntelligence();
			this.setSuperSuperHighGlamor();
			NRH3 -= 1;
		}
		else if(act1.equals("SGP")){
			System.out.println("�z��ܤF SGP �J��Ū�ѷ| ");
			this.setSuperDownEnergy();
			this.setHighIntelligence();
			SGP3 -= 1;
		}
		else if(act1.equals("BRN")){	
			System.out.println("�z��ܤF BRN ��q ");
			this.setSuperHighEnergy();
			this.setSuperHighIntelligence();
			this.setHighGlamor();	
			BRN3 -= 1;
		}
		else{
			System.out.println("�z��J���~�����ʥN���A�Э��s��J");
			Activity1(act1);		
		}
	}
	
	
	
	public void Activity2(String act2){          /////////�̳y���a�G��J�����ʥN�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		
		if(act2.equals("SLP")){
			System.out.println("�z��ܤF SLP ��ı ");
			this.setLittleHighEnergy();
			SLP3 -= 1;
			
		}
		else if(act2.equals("STY")){
			System.out.println("�z��ܤF STY Ū���� ");
			this.setHighIntelligence();
			STY3 -= 1;
		}	
		else if(act2.equals("CLH")){
			System.out.println("�z��ܤF CLH �m�˶R��A ");
			this.setSuperHighGlamor();
			CLH3 -= 1;
			
		}		
		else if(act2.equals("PTY")){	
			System.out.println("�z��ܤF PTY �Y�a�E ");
			this.setHighEnergy();
			this.setDownIntelligence();
			this.setHighGlamor();
			PTY3 -= 1;
		}		
		else if(act2.equals("NRH")){	
			System.out.println("�z��ܤF NRH �]�� ");
			this.setSuperDownEnergy();
			this.setLittleHighIntelligence();
			this.setSuperSuperHighGlamor();
			NRH3 -= 1;
		}
		else if(act2.equals("SGP")){
			System.out.println("�z��ܤF SGP �J��Ū�ѷ| ");
			this.setSuperDownEnergy();
			this.setHighIntelligence();
			SGP3 -= 1;
		}
		else if(act2.equals("BRN")){	
			System.out.println("�z��ܤF BRN ��q ");
			this.setSuperHighEnergy();
			this.setSuperHighIntelligence();
			this.setHighGlamor();	
			BRN3 -= 1;
		}
		else{
			System.out.println("�z��J���~�����ʥN���A�Э��s��J");
			Activity2(act2);		
		}
	}
	
	
	
	public void Event1(String event, PLAYER player2){  //////////�̷�Ū�����ƥ�N�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		if(event.equals("PWF")) //�Yevent��"PWF"�h�i��{}����statement
		{
			this.setDownEnergy();						
			SGP3 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
		else if(event.equals("ERQ"))//�Yevent��"ERQ"�h�i��{}����statement
		{
			this.setDownIntelligence();
			SLP3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"SLP ��ı"
		}
		else if(event.equals("LOL"))//�Yevent��"LOL"�h�i��{}����statement
		{
			this.setSuperLittleDownGlamor();
		}
		else if(event.equals("TYP"))//�Yevent��"TYP"�h�i��{}����statement
		{
			this.setSuperDownEnergy();
			CLH3 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			NRH3 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"NRH �]��"
		}
		else if(event.equals("EXC"))//�Yevent��"EXC"�h�i��{}����statement
		{
			this.energy=player2.identity.energy;
			this.intelligence=player2.identity.intelligence;
			this.glamor=player2.identity.glamor;
		}
		else if(event.equals("EOW"))//�Yevent��"EOW"�h�i��{}����statement
		{
			this.setSuperSuperDownEnergy();
			this.setSuperSuperDownIntelligence();
			this.setSuperDownGlamor();
			STY3 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"STY Ū����"
			CLH3 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			PTY3 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"PTY �Y�a�E"
			SGP3 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
	
	
	}
	
	
	
	public void Event2(String event, PLAYER player1){  //////////�̷�Ū�����ƥ�N�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		if(event.equals("PWF")) //�Yevent��"PWF"�h�i��{}����statement
		{
			this.setDownEnergy();						
			SGP3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
		else if(event.equals("ERQ"))//�Yevent��"ERQ"�h�i��{}����statement
		{
			this.setDownIntelligence();
			SLP3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"SLP ��ı"
		}
		else if(event.equals("LOL"))//�Yevent��"LOL"�h�i��{}����statement
		{
			this.setSuperLittleDownGlamor();
		}
		else if(event.equals("TYP"))//�Yevent��"TYP"�h�i��{}����statement
		{
			this.setSuperDownEnergy();
			CLH3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			NRH3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"NRH �]��"
		}
		else if(event.equals("EXC"))//�Yevent��"EXC"�h�i��{}����statement
		{
			this.energy=player1.identity.energy;
			this.intelligence=player1.identity.intelligence;
			this.glamor=player1.identity.glamor;
		}
		else if(event.equals("EOW"))//�Yevent��"EOW"�h�i��{}����statement
		{
			this.setSuperSuperDownEnergy();
			this.setSuperSuperDownIntelligence();
			this.setSuperDownGlamor();
			STY3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"STY Ū����"
			CLH3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			PTY3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"PTY �Y�a�E"
			SGP3 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
	
	
	}
	
	
}