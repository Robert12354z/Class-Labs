package hw02;
import java.util.*;
/* Name: Roberto Reyes
 * CIN: 306807805
 * Course & Section: CS2012 Sections 1 & 2 
 * Description: An NPC class uses 7 types of data fields in which allows
 * the object to either move along any x/y plane while also allowing the user
 * to interact with the NPC by talking to them.
 */
public class NPC {
	private String name; 
	private String race;
	private int xPos;
	private int yPos;
	private String dialogue[];//Array of Strings which is sent to the main method
	private boolean hasSequentialDialogue;
	private static int nextDialogue=0;//Determines which lines of the string will be Sequential

	public NPC() {
		this.dialogue= new String[1];//Default value is 1 
		this.dialogue[0]="PLACEHOLDERTEXT";
		this.name="UNNAMED";
		this.race="NO RACE";
		this.xPos=-999;
		this.yPos=-999;
		this.hasSequentialDialogue=false;
		this.nextDialogue +=1;
	}
	public NPC(String name, String race, int xPos, int yPos, String dialogue[],
			boolean hasSequentialDialogue) {

		this.setYPos(yPos);
		this.setXPos(xPos);
		this.setName(name);
		this.setRace(race);
		this.setDialogue(dialogue);
		this.setHasSequentialDialogue(hasSequentialDialogue);
		this.hasSequentialDialogue=hasSequentialDialogue;
	}
	public String getName() {
		return this.name;
	}
	public String getRace() {
		return this.race;
	}
	public int getXPos() {
		return this.xPos;
	}
	public int getYPos() {
		return this.yPos;
	}
	public String[] getDialogue() {
		return this.dialogue;
	}
	public boolean gethasSequentialDialogue() {
		return this.hasSequentialDialogue;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setRace(String race) {
		this.race=race;	
	}
	public void setXPos(int xPos) {
		if(xPos<0) {
			System.out.println("ERROR: The xPos can not be negative");
		}
		else { 
			this.xPos=xPos;
		}
	}
	public void setYPos(int yPos) {
		if(yPos<0) {
			System.out.println("ERROR: The yPos can not be negative");
		}
		else {
			this.yPos=yPos;
		}
	}
	public void setDialogue(String[] dialogue){
		this.dialogue=dialogue;
	}
	public void setHasSequentialDialogue(boolean hasSequentialDialogue) {
		this.hasSequentialDialogue = hasSequentialDialogue;
	}
	public void talk() {// had difficulties with talk method, problem was could not establish an array
		Random rand= new Random();
		 int a = rand.nextInt(this.dialogue.length);
		 
		 if(this.hasSequentialDialogue==false) {
		System.out.println(dialogue[a]);
		 }
		 else if (hasSequentialDialogue==true) {
			 for(int i =0; i<4; i++) {
				 System.out.println(dialogue[nextDialogue]);
				 nextDialogue++;
			 }
			 nextDialogue=0;
		 }
	}



	public void walkUp() {
		if(xPos>999) {
			System.out.println("ERROR: The xPos is already at 999");			
		}else {
			xPos= this.xPos+1;
		}
	}
	public void walkDown() {
		if(xPos<0) {
			System.out.println("ERROR: The xPos is already at 0");
		}else {
			xPos=this.xPos-1;
		}
	}
	public void walkLeft() {
		if(yPos<0) {
			System.out.println("ERROR: The yPos is already at 0");
		}else {
			yPos= this.yPos-1;
		}
	}
	public void walkRight() {
		if(yPos>999) {
			System.out.println("ERROR: The yPos is already at 999");
		}else {
			yPos=this.yPos+1;
		}
	}
	public String toString()
	{
		String output="";

		output += "\n";
		output += "Name:\t"+"\t"+this.name+"\n";
		output += "Race:\t"+"\t"+this.race+"\t"+"\n";
		output += "Location:\t"+"("+this.xPos+","+this.yPos+")"+"\n";
		output += "Sequential:\t"+this.hasSequentialDialogue+"\n";
		output += "Dialogue:\t" + Arrays.toString(this.dialogue);

		return output;
	}

}
