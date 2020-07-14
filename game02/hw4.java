import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class hw4{

	public static void main(String args[]){
		//Ū��event.txt��contest.txt����ɮ� 
		try{
			
			BufferedReader inputStream1 = new BufferedReader(new FileReader("event.txt"));
			String event=inputStream1.readLine();///////////////�v��Ū��event.txt�������
			BufferedReader inputStream2 = new BufferedReader(new FileReader("contest.txt"));
			String contest=inputStream2.readLine();///////////�v��Ū��contest.txt�������
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("log.txt"));///////////��X��log.txt
			String n1, n2;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("�w��Ө�\"�q���j�@�H�� �� �㥽��s���ð_\"");
			System.out.println("�п�J���a�@������W��");
			n1=keyboard.next();
			PLAYER player1 = new PLAYER(n1);////////////////�s�W���a�@player1��PLAYER class���@�ӷs��object
			System.out.println("���a�@��: "+n1);
			System.out.println("�п�J���a�G������W��");
			n2=keyboard.next();
			PLAYER player2 = new PLAYER(n2);////////////////�s�W���a�Gplayer2��PLAYER class���@�ӷs��object
			System.out.println("���a�G��: "+n2);
			
			String c1, c2;
			System.out.println("�Ъ��a�@��ܥH�U�䤤�@�ج��z�����⨭���W�١A�ÿ�J������s��");
			System.out.println("HK �v��");
			System.out.println("BR ����");
			System.out.println("PB ���@");
			c1=keyboard.next();
			
			if(c1.equals("HK"))///////////////�Y���a�@��J��������HK�h�i��H�U{}����statements
			{
				player1.setIdentity(new HK(n1, c1));/////////////�Q��up-casting����k��player1���@��HK��object
				System.out.println("�z��ܤF HK �v��");
			}	
			
			else if(c1.equals("BR"))///////////////�Y���a�@��J��������BR�h�i��H�U{}����statements
			{
				player1.setIdentity(new BR(n1, c1));/////////////�Q��up-casting����k��player1���@��BR��object
				System.out.println("�z��ܤF BR ����");
			}	
			
			else if(c1.equals("PB"))///////////////�Y���a�@��J��������PB�h�i��H�U{}����statements
			{
				player1.setIdentity(new PB(n1, c1));/////////////�Q��up-casting����k��player1���@��PB��object
				System.out.println("�z��ܤF PB ���@");
			}	
			
			
			
			System.out.println("�Ъ��a�G��ܥH�U�䤤�@�ج��z�����⨭���W�١A�ÿ�J������s��");
			System.out.println("HK �v��");
			System.out.println("BR ����");
			System.out.println("PB ���@");
			c2=keyboard.next();
			
			if(c2.equals("HK"))///////////////�Y���a�G��J��������HK�h�i��H�U{}����statements
			{
				player2.setIdentity(new HK(n2, c2));/////////////�Q��up-casting����k��player2���@��HK��object
				System.out.println("�z��ܤF HK �v��");
			}	
			
			else if(c2.equals("BR"))///////////////�Y���a�G��J��������BR�h�i��H�U{}����statements
			{
				player2.setIdentity(new BR(n2, c2));/////////////�Q��up-casting����k��player2���@��BR��object
				System.out.println("�z��ܤF BR ����");
			}	
			
			else if(c2.equals("PB"))///////////////�Y���a�G��J��������PB�h�i��H�U{}����statements
			{
				player2.setIdentity(new PB(n2, c2));/////////////�Q��up-casting����k��player2���@��PB��object
				System.out.println("�z��ܤF PB ���@");
			}	
				
			
			PLAYER.print(c1, c2, n1, n2, player1, player2);///////////�L�X���ɪ��a�@�Ϊ��a�G������W��,�����W��,�U����O�ȤγӧQ����
			//////�H�U��X��log.txt
			outputStream.println("Game Start");
			outputStream.println("P1-"+player1.identity.playername+"["+c1+","+player1.identity.energy+","+player1.identity.intelligence+","+player1.identity.glamor+","+player1.identity.victoryrecord+"]");
			outputStream.println("P2-"+player2.identity.playername+"["+c2+","+player2.identity.energy+","+player2.identity.intelligence+","+player2.identity.glamor+","+player2.identity.victoryrecord+"]");
		
			//�H�U�ŧi���{���ݭn�Ψ줧�ܼ�
			int one;
			
			
		    //�H�U��5�^�X���C��(5���j��)
			for(one=1;one<=5;one++){
				String x = null;//initialization
				if(one==1)
					x="�@";
				else if(one==2)
					x="�G";
				else if(one==3)
					x="�T";
				else if(one==4)
					x="�|";
				else if(one==5)
					x="��";
				System.out.println("���C���@�����^�X");
				System.out.println("�{�b��"+x+"�^�X�}�l!");
				
				int next;
				PLAYER.stage1(player1, player2, c1, c2);  //�Ĥ@���q:���ʶ��q
	
				PLAYER.stage2(event, player1, player2, c1, c2);  //�ĤG���q:�ƥ󶥬q
				event = inputStream1.readLine();

				PLAYER.stage3(contest, player1, player2, c1, c2);  //�ĤT���q:�v�ɶ��q
				contest = inputStream2.readLine();
				
				//////�H�U��X��log.txt
				outputStream.println("Playing-"+one);
				outputStream.println("P1-"+player1.identity.playername+"["+PLAYER.act1_1+","+PLAYER.act1_2+"]");
				outputStream.println("P2-"+player2.identity.playername+"["+PLAYER.act2_1+","+PLAYER.act2_2+"]");
				outputStream.println("Event-"+event);
				outputStream.println("Contest-"+contest);
				outputStream.println(PLAYER.winner);
				outputStream.println("P1-"+player1.identity.playername+"["+c1+","+player1.identity.energy+","+player1.identity.intelligence+","+player1.identity.glamor+","+player1.identity.victoryrecord+"]");
				outputStream.println("P2-"+player2.identity.playername+"["+c2+","+player2.identity.energy+","+player2.identity.intelligence+","+player2.identity.glamor+","+player2.identity.victoryrecord+"]");
				
			
			}	
			
		
			PLAYER.finaltest(player1, player2);  //�ǥ�"�㥽��f�P��{��"�ӭp��X�����C����Ĺ�a��"�㥽��^��"
			//////�H�U��X��log.txt
			outputStream.println("Game Set");
			outputStream.println("P1-"+player1.identity.playername+"["+c1+","+player1.identity.energy+","+player1.identity.intelligence+","+player1.identity.glamor+","+player1.identity.victoryrecord+"]");
			outputStream.println("P2-"+player2.identity.playername+"["+c2+","+player2.identity.energy+","+player2.identity.intelligence+","+player2.identity.glamor+","+player2.identity.victoryrecord+"]");
			outputStream.println(PLAYER.finalwinner);
		
			inputStream1.close();
			inputStream2.close();
			outputStream.close();
		}
		catch(IOException e)//�Y�L�kŪ���ɮ׫h�i��H�U{}����statement
			{
				System.out.println("Problem opening files.");
				System.out.println("Error reading from event.txt and contest.txt");
			}
			
			
	}
}	