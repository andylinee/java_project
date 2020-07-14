import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class Identity{

	protected String character;
	protected String playername;
	public String winner;
	public int energy;
	public int intelligence;
	public int glamor;
	public int victoryrecord;
	//�H�U��Identity��constructor
	public Identity(String eachplayername, String eachcharacter, int eachenergy, int eachintelligence, int eachglamor, int eachvictoryrecord){
	
	this.character = eachcharacter;
	this.playername = eachplayername;
	this.energy = eachenergy;
	this.intelligence = eachintelligence;
	this.glamor = eachglamor;
	this.victoryrecord = eachvictoryrecord;
	}
	//�H�U���ݭn�Ψ줧methods
	public void Input(){}
	public void Reset(){}
	public void Activity1(String act1){}
	public void Activity2(String act2){}
	public void Event1(String event, PLAYER player2){}
	public void Event2(String event, PLAYER player1){}
	public void ChangeAfterContest1(String contest, int ga1, int ga2){       /////////���a�@�g�L�v�ɫ���ܯ�O��
	
		if(contest.equals("ICSC"))//�Ycontest��"ICSC"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				winner = "Winner- "+this.playername;
				this.setSuperSuperDownEnergy();
				this.setSuperHighIntelligence();
				this.setSuperDownGlamor();
				this.setHighVictoryRecord();
				
			}
			else if(ga1<ga2)
			{
				
				this.setHighIntelligence();
				this.setLittleHighGlamor();
			}
			else
				winner = "Tie Game";
		}
		else if(contest.equals("BOWL"))  //�Ycontest��"BOWL"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				winner = "Winner- "+this.playername;
				this.setSuperDownEnergy();
				this.setSuperHighGlamor();
				this.setHighVictoryRecord();
			}
			else if(ga1<ga2)
			{
				this.setDownEnergy();
				this.setHighIntelligence();
			}	
			else
				winner = "Tie Game";
		}
		else if(contest.equals("TOUR"))  //�Ycontest��"TOUR"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
			    winner = "Winner- "+this.playername;
				this.setSuperSuperDownEnergy();
				this.setHighGlamor();
				this.setHighVictoryRecord();
			}
			else if(ga1<ga2)
			{
				this.setSuperDownEnergy();
				this.setHighGlamor();
			}
			else
				winner = "Tie Game";
		}
		else if(contest.equals("IDSC"))  //�Ycontest��"IDSC"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				winner = "Winner- "+this.playername;
				this.setSuperSuperDownEnergy();
				this.setSuperSuperSuperHighGlamor();;
				this.setHighVictoryRecord();
			}
			else if(ga1<ga2)
			{
				this.setSuperDownEnergy();
				this.setHighGlamor();
			}
			else
				winner = "Tie Game";
		}
		else if(contest.equals("FMSC"))  //�Ycontest��"FMSC"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				winner = "Winner- "+this.playername;
				this.setSuperSuperDownEnergy();
				this.setSuperHighIntelligence();
				this.setLittleHighGlamor();
				this.setHighVictoryRecord();
			}
			else if(ga1<ga2)
			{
				this.setSuperDownEnergy();
				this.setHighIntelligence();
			}
			else
				winner = "Tie Game";
		}
	}
	
	
	public void ChangeAfterContest2(String contest, int ga1, int ga2){         /////////���a�G�g�L�v�ɫ���ܯ�O��
	
		if(contest.equals("ICSC"))//�Ycontest��"ICSC"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				this.setHighIntelligence();
				this.setLittleHighGlamor();
			}
			else if(ga1<ga2)
			{
				winner = "Winner- "+this.playername;
				this.setSuperSuperDownEnergy();
				this.setSuperHighIntelligence();
				this.setSuperDownGlamor();
				this.setHighVictoryRecord();
			}
			else
				winner = "Tie Game";
		}
		else if(contest.equals("BOWL"))  //�Ycontest��"BOWL"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				this.setDownEnergy();
				this.setHighIntelligence();
			}
			else if(ga1<ga2)
			{
				winner = "Winner- "+this.playername;
				this.setSuperDownEnergy();
				this.setSuperHighGlamor();
				this.setHighVictoryRecord();
				this.setDownEnergy();
				this.setHighIntelligence();
			}	
			else
				winner = "Tie Game";
		}
		else if(contest.equals("TOUR"))  //�Ycontest��"TOUR"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				this.setSuperDownEnergy();
				this.setHighGlamor();
			}
			else if(ga1<ga2)
			{
				winner = "Winner- "+this.playername;
				this.setSuperSuperDownEnergy();
				this.setHighGlamor();
				this.setHighVictoryRecord();
			}
			else
				winner = "Tie Game";
		}
		else if(contest.equals("IDSC"))  //�Ycontest��"IDSC"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				this.setSuperDownEnergy();
				this.setHighGlamor();
			}
			else if(ga1<ga2)
			{
				winner = "Winner- "+this.playername;
				this.setSuperSuperDownEnergy();
				this.setSuperSuperSuperHighGlamor();;
				this.setHighVictoryRecord();
			}
			else
				winner = "Tie Game";
		}
		else if(contest.equals("FMSC"))  //�Ycontest��"FMSC"�h�i��{}����statement
		{
			
			if(ga1>ga2)
			{
				this.setSuperDownEnergy();
				this.setHighIntelligence();
			}
			else if(ga1<ga2)
			{
				
				winner = "Winner- "+this.playername;
				this.setSuperSuperDownEnergy();
				this.setSuperHighIntelligence();
				this.setLittleHighGlamor();
				this.setHighVictoryRecord();
			}
			else
				winner = "Tie Game";
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
	
	public void setSuperSuperDownIntelligence(){
		this.intelligence -= 20;
	}
	
	public void setSuperSuperDownGlamor(){
		this.glamor -= 20;		
	}
	
	public void setSuperLittleDownGlamor(){
		this.glamor -= 15;
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
	
	public void setSuperSuperSuperHighGlamor(){
		this.glamor += 25;	
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