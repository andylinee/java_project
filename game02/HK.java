import java.util.Scanner;


public class HK extends Identity{
	public String winner;
	public HK(String eachplayername, String eachcharacter){
		super(eachplayername, eachcharacter, 100, 90, 60, 0);   /////�~��Identity.java��constructor
		
	}
	
	int SLP1=8;
	int STY1=4;
	int CLH1=2;
	int PTY1=2;
	int NRH1=2;
	int SGP1=8;
	int BRN1=1; 
	
	
	public void Input(){  /////�L�X�i�i�檺���ʦC��
	
		System.out.println("���a "+this.playername+"�z�n!");
		System.out.println("�H�U���z��e�i�i�檺���� :");
		if(SLP1>=1)
		System.out.println("SLP ��ı");//�Yvariable"SLP1">=1�h��ܦ��y
		if(STY1>=1)
		System.out.println("STY Ū����");//�Yvariable"STY1">=1�h��ܦ��y
		if(CLH1>=1)
		System.out.println("CLH �m�˶R��A");//�Yvariable"CLH1">=1�h��ܦ��y
		if(PTY1>=1)
		System.out.println("PTY �Y�a�E");//�Yvariable"PTY1">=1�h��ܦ��y
		if(NRH1>=1)
		System.out.println("NRH �]��");//�Yvariable"NRH1">=1�h��ܦ��y
		if(SGP1>=1)
		System.out.println("SGP �J��Ū�ѷ|");//�Yvariable"SGP1">=1�h��ܦ��y
		if(BRN1>=1)
		System.out.println("BRN ��q");//�Yvariable"BRN1">=1�h��ܦ��y
		System.out.println("�п�J�z�Q�i�檺���ʤ����ʥN��");
	}
	public void Reset(){  ////////////���s�]�w��ܬ��ʱ���
		if(SLP1<= 0-50)
		SLP1 += 100;
		if(STY1<= 0-50)
		STY1 += 100;
		if(CLH1<= 0-50)
		CLH1 += 100;
		if(PTY1<= 0-50)
		PTY1 += 100;
		if(NRH1<= 0-50)
		NRH1 += 100;
		if(SGP1<= 0-50)
		SGP1 += 100;
		if(BRN1<= 0-50)
		BRN1 += 100;		
	}
	
		
	public void Activity1(String act1){	   //////////�̷Ӫ��a�@��J�����ʥN�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		
				
		if(act1.equals("SLP")){
			System.out.println("�z��ܤF SLP ��ı ");
			this.setSuperHighEnergy();
			SLP1 -= 1;
			
		}
		else if(act1.equals("STY")){
			System.out.println("�z��ܤF STY Ū���� ");
			this.setHighIntelligence();
			STY1 -= 1;
			
		}	
		else if(act1.equals("CLH")){
			System.out.println("�z��ܤF CLH �m�˶R��A ");
			this.setHighGlamor();
			CLH1 -= 1;
			
		}		
		else if(act1.equals("PTY")){	
			System.out.println("�z��ܤF PTY �Y�a�E ");
			this.setLittleHighEnergy();
			this.setDownIntelligence();
			this.setLittleHighGlamor();
			PTY1 -= 1;
		}		
		else if(act1.equals("NRH")){	
			System.out.println("�z��ܤF NRH �]�� ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();
			NRH1 -= 1;
		}
		else if(act1.equals("SGP")){
			System.out.println("�z��ܤF SGP �J��Ū�ѷ| ");
			this.setSuperDownEnergy();
			this.setSuperHighIntelligence();
			SGP1 -= 1;
		}
		else if(act1.equals("BRN")){	
			System.out.println("�z��ܤF BRN ��q ");
			this.setSuperSuperHighEnergy();
			this.setHighIntelligence();
			this.setHighGlamor();	
			BRN1 -= 1;
		}
		else{
			System.out.println("�z��J���~�����ʥN���A�Э��s��J");
			Activity1(act1);		
		}
	}
	public void Activity2(String act2){	       //////////�̷Ӫ��a�G��J�����ʥN�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		
				
		if(act2.equals("SLP")){
			System.out.println("�z��ܤF SLP ��ı ");
			this.setSuperHighEnergy();
			SLP1 -= 1;
			
		}
		else if(act2.equals("STY")){
			System.out.println("�z��ܤF STY Ū���� ");
			this.setHighIntelligence();
			STY1 -= 1;
			
		}	
		else if(act2.equals("CLH")){
			System.out.println("�z��ܤF CLH �m�˶R��A ");
			this.setHighGlamor();
			CLH1 -= 1;
			
		}		
		else if(act2.equals("PTY")){	
			System.out.println("�z��ܤF PTY �Y�a�E ");
			this.setLittleHighEnergy();
			this.setDownIntelligence();
			this.setLittleHighGlamor();
			PTY1 -= 1;
		}		
		else if(act2.equals("NRH")){	
			System.out.println("�z��ܤF NRH �]�� ");
			this.setSuperSuperDownEnergy();
			this.setHighIntelligence();
			this.setSuperHighGlamor();
			NRH1 -= 1;
		}
		else if(act2.equals("SGP")){
			System.out.println("�z��ܤF SGP �J��Ū�ѷ| ");
			this.setSuperDownEnergy();
			this.setSuperHighIntelligence();
			SGP1 -= 1;
		}
		else if(act2.equals("BRN")){	
			System.out.println("�z��ܤF BRN ��q ");
			this.setSuperSuperHighEnergy();
			this.setHighIntelligence();
			this.setHighGlamor();	
			BRN1 -= 1;
		}
		else{
			System.out.println("�z��J���~�����ʥN���A�Э��s��J");
			Activity2(act2);		
		}
	}
	
	
	
	
	public void Event1(String event, PLAYER player2){         //////////�̷�Ū�����ƥ�N�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		if(event.equals("PWF")) //�Yevent��"PWF"�h�i��{}����statement
		{
			this.setSuperSuperDownEnergy();						
			SGP1 -=100;//�Ϫ��a�@�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
		else if(event.equals("ERQ"))//�Yevent��"ERQ"�h�i��{}����statement
		{
			this.setDownIntelligence();
		}
		else if(event.equals("LOL"))//�Yevent��"LOL"�h�i��{}����statement
		{
			this.setHighGlamor();
		}
		else if(event.equals("TYP"))//�Yevent��"TYP"�h�i��{}����statement
		{
			this.setHighEnergy();
			CLH1 -=100;//�Ϫ��a�@�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			NRH1 -=100;//�Ϫ��a�@�U�@�^�X�L�k�i��"NRH �]��"
		}
		else if(event.equals("EXC"))//�Yevent��"EXC"�h�i��{}����statement
		{
			this.energy=player2.identity.energy;
			this.intelligence=player2.identity.intelligence;
			this.glamor=player2.identity.glamor;
		}
		else if(event.equals("EOW"))//�Yevent��"EOW"�h�i��{}����statement
		{
			this.setSuperDownEnergy();
			this.setSuperSuperDownIntelligence();
			this.setSuperSuperDownGlamor();
			STY1 -=100;//�Ϫ��a�@�U�@�^�X�L�k�i��"STY Ū����"
			CLH1 -=100;//�Ϫ��a�@�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			PTY1 -=100;//�Ϫ��a�@�U�@�^�X�L�k�i��"PTY �Y�a�E"
			SGP1 -=100;//�Ϫ��a�@�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
	
	
	}
	
	public void Event2(String event, PLAYER player1){    //////////�̷�Ū�����ƥ�N�����͸Ӭ��ʩҳy�����ӤH��O�Ȫ��v�T
		if(event.equals("PWF")) //�Yevent��"PWF"�h�i��{}����statement
		{
			this.setSuperSuperDownEnergy();						
			SGP1 -=100;//�Ϫ��a�G�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
		else if(event.equals("ERQ"))//�Yevent��"ERQ"�h�i��{}����statement
		{
			this.setDownIntelligence();
		}
		else if(event.equals("LOL"))//�Yevent��"LOL"�h�i��{}����statement
		{
			this.setHighGlamor();
		}
		else if(event.equals("TYP"))//�Yevent��"TYP"�h�i��{}����statement
		{
			this.setHighEnergy();
			CLH1 -=100;//�Ϫ��a�G�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			NRH1 -=100;//�Ϫ��a�G�U�@�^�X�L�k�i��"NRH �]��"
		}
		else if(event.equals("EXC"))//�Yevent��"EXC"�h�i��{}����statement
		{
			this.energy=player1.identity.energy;
			this.intelligence=player1.identity.intelligence;
			this.glamor=player1.identity.glamor;
		}
		else if(event.equals("EOW"))//�Yevent��"EOW"�h�i��{}����statement
		{
			this.setSuperDownEnergy();
			this.setSuperSuperDownIntelligence();
			this.setSuperSuperDownGlamor();
			STY1 -=100;//�Ϫ��a�G�U�@�^�X�L�k�i��"STY Ū����"
			CLH1 -=100;//�Ϫ��a�G�U�@�^�X�L�k�i��"CLH �m�˶R��A"
			PTY1 -=100;//�Ϫ��a�G�U�@�^�X�L�k�i��"PTY �Y�a�E"
			SGP1 -=100;//�Ϫ��a�G�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
		}
	
	}

}