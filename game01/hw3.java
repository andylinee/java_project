import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class hw3{

	public static void main(String args[]){
		//Ū��event.txt��contest.txt����ɮ� 
		try
		{
			
			BufferedReader inputStream1 = new BufferedReader(new FileReader("event.txt"));
			String event=inputStream1.readLine();//�v��Ū��event.txt�������
			BufferedReader inputStream2 = new BufferedReader(new FileReader("contest.txt"));
			String contest=inputStream2.readLine();//�v��Ū��event.txt�������
			String n1, n2;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("�w��Ө�\"�q���j�@�H�� �� ����氫\"");
			System.out.println("�п�J���a�@������W��");
			n1=keyboard.next();
			PLAYER player1 = new PLAYER(n1);//�إ߷sobject "player1"�����a�@
			System.out.println("���a�@��: "+player1.playername);
			System.out.println("�п�J���a�G������W��");
			n2=keyboard.next();
			PLAYER player2 = new PLAYER(n2);//�إ߷sobject "player2"�����a�G
			System.out.println("���a�G��: "+player2.playername);
		
			//�H�U�ŧi���{���ݭn�Ψ줧�ܼ�
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
			 
			
			
		    //�H�U��4�^�X���C��(4���j��)
			for(one=0;one<=3;one++){
				String x = null;//initialization
				if(one==0)
				x="�@";
				else if(one==1)
				x="�G";
				else if(one==2)
				x="�T";
				else if(one==3)
				x="�|";
				System.out.println("���C���@���|�^�X");
				System.out.println("�{�b��"+x+"�^�X�}�l!");
			
			
			
			
				//�H�U��2�^�X�����ʶ��q(2���j��)
			
				for(next=0;next<=1;next++){
				
				  
					
					
					player1.Input1();
					player2.Input2();
		
							
					//�H�U��ܪ��a�@�M���a�G�g�L���ʫ᪺��O��
					System.out.println("Player1 : "+player1.playername);
					System.out.println("��O :"+player1.energy);
					System.out.println("���O :"+player1.intelligence);
					System.out.println("�y�O :"+player1.glamor);
					System.out.println("�ӧQ�O�� :"+player1.victoryrecord);
					System.out.println("Player2 : "+player2.playername);
					System.out.println("��O :"+player2.energy);
					System.out.println("���O :"+player2.intelligence);
					System.out.println("�y�O :"+player2.glamor);
					System.out.println("�ӧQ�O�� :"+player2.victoryrecord);
				}
			
				
				//�H�U���ƥ󶥬q
				
				if(event.equals("PWF")) //�Yevent��"PWF"�h�i��{}����statement
				{
					System.out.println("�Y�N�o��\"PWF ���q\"");
					player1.setSuperDownEnergy();
					player2.setSuperDownEnergy();						
					SGP1 -=1;//�Ϫ��a�@�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
					SGP2 -=1;//�Ϫ��a�G�U�@�^�X�L�k�i��"SGP �J��Ū�ѷ|"
				}
				else if(event.equals("ERQ"))//�Yevent��"ERQ"�h�i��{}����statement
				{
					System.out.println("�Y�N�o��\"ERQ �a�_\"");
					player1.setDownIntelligence();
					player2.setDownIntelligence();
					SLP1 -=1;//�Ϫ��a�@�U�@�^�X�L�k�i��"SLP ��ı"
					SLP2 -=1;//�Ϫ��a�G�U�@�^�X�L�k�i��"SLP ��ı"
				}
				else if(event.equals("LOL"))//�Yevent��"LOL"�h�i��{}����statement
				{
					System.out.println("�Y�N�|��\"LOL LOL�j��\"");
					player1.setSuperDownGlamor();
					player2.setSuperDownGlamor();
				}
				else if(event.equals("TYP"))//�Yevent��"TYP"�h�i��{}����statement
				{
					System.out.println("�Y�N�o��\"TYP �䭷��\"");
					player1.setHalfEnergy();
					player2.setHalfEnergy();
					CLH1 -=1;//�Ϫ��a�@�U�@�^�X�L�k�i��"CLH �m�˶R��A"
					NRH1 -=1;//�Ϫ��a�@�U�@�^�X�L�k�i��"�]��"
					CLH2 -=1;//�Ϫ��a�G�U�@�^�X�L�k�i��"CLH �m�˶R��A"
					NRH2 -=1;//�Ϫ��a�G�U�@�^�X�L�k�i��"�]��"
				}
				//�H�U��ܪ��a�@�M���a�G�g�L�ƥ�v�T�᪺��O��
				System.out.println("Player1 : "+player1.playername);
				System.out.println("��O :"+player1.energy);
				System.out.println("���O :"+player1.intelligence);
				System.out.println("�y�O :"+player1.glamor);
		        System.out.println("�ӧQ�O�� :"+player1.victoryrecord);
				System.out.println("Player2 : "+player2.playername);
				System.out.println("��O :"+player2.energy);
				System.out.println("���O :"+player2.intelligence);
				System.out.println("�y�O :"+player2.glamor);
				System.out.println("�ӧQ�O�� :"+player2.victoryrecord);		
				event = inputStream1.readLine();
				
				//�H�U���v�ɶ��q
				if(contest.equals("ICSC"))//�Ycontest��"ICSC"�h�i��{}����statement
					{
						System.out.println("�Y�N�i��\"�p���Ҹ�\"");
						int ga1 = player1.energy*1 + player1.intelligence*4 + player1.glamor*2;//�p�⪱�a�@���ǥX��{��
						int ga2 = player2.energy*1 + player2.intelligence*4 + player2.glamor*2;//�p�⪱�a�G���ǥX��{��
						//�H�U�P�_�����ӡAstatements���ӱѤ�ҳy�����v�T
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
				else if(contest.equals("BOWL"))//�Ycontest��"BOWL"�h�i��{}����statement
					{
						System.out.println("�Y�N�i��\"���O�ֲy\"");
						int ga1 = player1.energy*4 + player1.intelligence*2 + player1.glamor*1;//�p�⪱�a�@���ǥX��{��
						int ga2 = player2.energy*4 + player2.intelligence*2 + player2.glamor*1;//�p�⪱�a�G���ǥX��{��
						//�H�U�P�_�����ӡAstatements���ӱѤ�ҳy�����v�T
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
				else if(contest.equals("TOUR"))//�Ycontest��"TOUR"�h�i��{}����statement
					{
						System.out.println("�Y�N�i��\"�Z�ڥX�C\"");
						int ga1 = player1.energy*2 + player1.intelligence*1 + player1.glamor*4;//�p�⪱�a�@���ǥX��{��
						int ga2 = player2.energy*2 + player2.intelligence*1 + player2.glamor*4;//�p�⪱�a�G���ǥX��{��
						//�H�U�P�_�����ӡAstatements���ӱѤ�ҳy�����v�T
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
					System.out.println("��O :"+player1.energy);
					System.out.println("���O :"+player1.intelligence);
					System.out.println("�y�O :"+player1.glamor);
					System.out.println("�ӧQ�O�� :"+player1.victoryrecord);
					System.out.println("Player2 : "+player2.playername);
					System.out.println("��O :"+player2.energy);
					System.out.println("���O :"+player2.intelligence);
					System.out.println("�y�O :"+player2.glamor);
					System.out.println("�ӧQ�O�� :"+player2.victoryrecord);		
					contest = inputStream2.readLine();
			}	
				int totalP1 = player1.energy + player1.intelligence + player1.glamor + player1.victoryrecord*5;//�̳y"���N�q���Q�D��{��"�p��X���a�@���`�n��
		        int totalP2 = player2.energy + player2.intelligence + player2.glamor + player2.victoryrecord*5;//�̳y"���N�q���Q�D��{��"�p��X���a�@���`�n��
				System.out.println("���a�@���`�n���� "+totalP1);
				System.out.println("���a�G���`�n���� "+totalP2);
				//�H�U�P�_��̬�Ĺ�a
				if(totalP1>totalP2)
					System.out.println("�o���C����Ĺ�a�O���a�@ "+player1.playername);
				else if(totalP1<totalP2)
					System.out.println("�o���C����Ĺ�a�O���a�G "+player2.playername);
				else
					System.out.println("�o�����ɪ��a�@�M���a�G����");
				
			
		
		}
			
		catch(FileNotFoundException e)//�Y�䤣���ɮ׫h�i��H�U{}����statement
			{
				System.out.println("Problem opening files.");
			}
		catch(IOException e)//�Y�L�kŪ���ɮ׫h�i��H�U{}����statement
			{
				System.out.println("Error reading from event.txt");
			}
			
			
	}
}	