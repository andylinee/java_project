import java.util.Scanner;


public class BR extends Identity{
	public String winner;
	
	public BR(String eachplayername, String eachcharacter){
		super(eachplayername, eachcharacter, 80, 100, 70, 0);      /////�~��Identity.java��constructor
	}
	
	
	int SLP2=4;
	int STY2=8;
	int CLH2=4;
	int PTY2=2;
	int NRH2=2;
	int SGP2=8;
	int BRN2=1; 
	
	
	public void Input(){        /////�L�X�i�i�檺���ʦC��
	
		System.out.println("���a "+this.playername+"�z�n!");
		System.out.println("�H�U���z��e�i�i�檺���� :");
		if(SLP2>=1)
		System.out.println("SLP ��ı");//�Yvariable"SLP1">=1�h��ܦ��y
		if(STY2>=1)
		System.out.println("STY Ū����");//�Yvariable"STY1">=1�h��ܦ��y
		if(CLH2>=1)
		System.out.println("CLH �m�˶R��A");//�Yvariable"CLH1">=1�h��ܦ��y
		if(PTY2>=1)
		System.out.println("PTY �Y�a�E");//�Yvariable"PTY1">=1�h��ܦ��y
		if(NRH2>=1)
		System.out.println("NRH �]��");//�Yvariable"NRH1">=1�h��ܦ��y
		if(SGP2>=1)
		System.out.println("SGP �J��Ū�ѷ|");//�Yvariable"SGP1">=1�h��ܦ��y
		if(BRN2>=1)
		System.out.println("BRN ��q");//�Yvariable"BRN1">=1�h��ܦ��y
		System.out.println("�п�J�z�Q�i�檺���ʤ����ʥN��");
				
	}
	 ////////////���s�]�w��ܬ��ʱ���
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
		
	public void Activity1(String act1){	  /////////�̳y���a�@��J�����ʥN�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
				
		if(act1.equals("SLP")){
			System.out.println("�z��ܤF SLP ��ı ");
			this.setLittleHighEnergy();
			SLP2 -= 1;
			
		}
		else if(act1.equals("STY")){
			System.out.println("�z��ܤF STY Ū���� ");
			this.setSuperHighIntelligence();
			STY2 -= 1;
		}	
		else if(act1.equals("CLH")){
			System.out.println("�z��ܤF CLH �m�˶R��A ");
			this.setHighGlamor();
			CLH2 -= 1;
		}		
		else if(act1.equals("PTY")){	
			System.out.println("�z��ܤF PTY �Y�a�E ");
			this.setLittleHighEnergy();
			this.setLittleDownIntelligence();
			this.setLittleHighGlamor();
			PTY2 -= 1;
		}		
		else if(act1.equals("NRH")){	
			System.out.println("�z��ܤF NRH �]�� ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();
			NRH2 -= 1;
		}
		else if(act1.equals("SGP")){
			System.out.println("�z��ܤF SGP �J��Ū�ѷ| ");
			this.setDownEnergy();
			this.setHighIntelligence();
			SGP2 -= 1;
		}
		else if(act1.equals("BRN")){	
			System.out.println("�z��ܤF BRN ��q ");
			this.setSuperHighEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();	
			BRN2 -= 1;
		}
		else{
			System.out.println("�z��J���~�����ʥN���A�Э��s��J");
			Activity1(act1);		
		}
	}
	
	
	
	public void Activity2(String act2){	   ///////////�̳y���a�G��J�����ʥN�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
				
	
		if(act2.equals("SLP")){
			System.out.println("�z��ܤF SLP ��ı ");
			this.setLittleHighEnergy();
			SLP2 -= 1;
			
		}
		else if(act2.equals("STY")){
			System.out.println("�z��ܤF STY Ū���� ");
			this.setSuperHighIntelligence();
			STY2 -= 1;
		}	
		else if(act2.equals("CLH")){
			System.out.println("�z��ܤF CLH �m�˶R��A ");
			this.setHighGlamor();
			CLH2 -= 1;
		}		
		else if(act2.equals("PTY")){	
			System.out.println("�z��ܤF PTY �Y�a�E ");
			this.setLittleHighEnergy();
			this.setLittleDownIntelligence();
			this.setLittleHighGlamor();
			PTY2 -= 1;
		}		
		else if(act2.equals("NRH")){	
			System.out.println("�z��ܤF NRH �]�� ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();
			NRH2 -= 1;
		}
		else if(act2.equals("SGP")){
			System.out.println("�z��ܤF SGP �J��Ū�ѷ| ");
			this.setDownEnergy();
			this.setHighIntelligence();
			SGP2 -= 1;
		}
		else if(act2.equals("BRN")){	
			System.out.println("�z��ܤF BRN ��q ");
			this.setSuperHighEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();	
			BRN2 -= 1;
		}
		else{
			System.out.println("�z��J���~�����ʥN���A�Э��s��J");
			Activity2(act2);		
		}
	}
	
	
	
	public void Event1(String event, PLAYER player2){    //////////�̷�Ū�����ƥ�N�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		if(event.equals("PWF")) //�Yevent��"PWF"�h�i��{}����statement
		{
			this.setSuperDownEnergy();						
			SGP2 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
		else if(event.equals("ERQ"))//�Yevent��"ERQ"�h�i��{}����statement
		{
			this.setDownIntelligence();
			SLP2 -= 100;
		}
		else if(event.equals("LOL"))//�Yevent��"LOL"�h�i��{}����statement
		{
			this.setSuperDownGlamor();
		}
		else if(event.equals("TYP"))//�Yevent��"TYP"�h�i��{}����statement
		{
			this.setHighIntelligence();
			CLH2 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			NRH2 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"NRH �]��"
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
			this.setDownIntelligence();
			this.setSuperSuperDownGlamor();
			STY2 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"STY Ū����"
			CLH2 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			PTY2 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"PTY �Y�a�E"
			SGP2 -= 100;//�Ϫ��a�@�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
	
	
	}
	
	public void Event2(String event, PLAYER player1){    //////////�̷�Ū�����ƥ�N�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		if(event.equals("PWF")) //�Yevent��"PWF"�h�i��{}����statement
		{
			this.setSuperDownEnergy();						
			SGP2 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
		else if(event.equals("ERQ"))//�Yevent��"ERQ"�h�i��{}����statement
		{
			this.setDownIntelligence();
			SLP2 -= 100;
		}
		else if(event.equals("LOL"))//�Yevent��"LOL"�h�i��{}����statement
		{
			this.setSuperDownGlamor();
		}
		else if(event.equals("TYP"))//�Yevent��"TYP"�h�i��{}����statement
		{
			this.setHighIntelligence();
			CLH2 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			NRH2 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"NRH�@�]��"
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
			this.setDownIntelligence();
			this.setSuperSuperDownGlamor();
			STY2 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"STY Ū����"
			CLH2 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			PTY2 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"PTY �Y�a�E"
			SGP2 -= 100;//�Ϫ��a�G�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
	
	
	}

}