package hw02;
/* Name: Roberto Reyes
 * CIN: 306807805
 * Course & Section: CS2012 Sections 1 & 2
 * Description: An NPC class main uses two menus to help allow 
 * the user to communicate to the NPCs by talking, seeing their info,
 * telling them to move around an x and y plane.
 * 				
 */
import java.util.*;
public class NPCMain {
	public static void main(String[] args) {	
		String dialogue1[]= {"I have found the golden ticket.\n","Willy Wonka will love me.\n",
				"No one has ever found the golden ticket.\n","This is a Miracle.\n","I can now make candy!\n"
				,"Geronimo\n", "CS is hard\n","Computers Suck\n","God is not really\n"};
		//Figured out the array needed to be intialized within the main class
		String dialogue2[]= {"If this array doesnt work,\n","I am going to cry\n",
				"Keenan this is your fault.\n","Nevermind it works.\n", 
				"Sorry for yelling.\n","Horray\n","This is America\n",
				"I'm the captain\n","I took an arrow to the knee\n"};
		NPC np1= new NPC();
		NPC np2= new NPC("Harry","Dragon",5,21,dialogue1,true);
		NPC np3= new NPC("Larry","Human",5,12,dialogue2,false);
		menu(np1,np2,np3);
		
	}
	public static void menu(NPC np1, NPC np2, NPC np3) {
		int menus =1;
		NPC menuChoice=null;
		int limiter = 0;
		while(limiter==0) {
			switch(menus) {
			case 1://used a case method to help switch between each menu 
				int limit = 0;
				while(limit==0) {
					Scanner scan= new Scanner(System.in);
					System.out.println("\n"+"Choose an NPC:\n" +
							"1."+np1.getName()+"\n"+ 
							"2."+np2.getName()+"\n"+
							"3."+np3.getName()+"\n"+
							"4."+"Exit Program \n"+
							"Enter the number choice (1-4)");
					int a= scan.nextInt();
					if (a == 1) {
						menuChoice= np1;
						menus= 2;
						limit=1;
					}
					else if(a==2) {
						menuChoice= np2;
						menus=2;
						limit=1;

					}
					else if(a==3) {
						menuChoice= np3;
						menus=2;
						limit=1;

					}
					else if(a==4) {
						System.out.println("The program is closing.");
						System.exit(0);
					}
				}

			case 2:
				Scanner look = new Scanner(System.in);
				int limit1=0;
				while(limit1 ==0) {
					System.out.println("\n"+"Test Menu for "+menuChoice.getName() +"\n"+
							"1. Display NPC Information"+"\n"+
							"2. Talk to NPC."+"\n"+
							"3. Make NPC walk up."+"\n"+
							"4. Make NPC walk down."+"\n"+
							"5. Make NPC walk left"+"\n"+
							"6. Make NPC walk right"+"\n"+
							"7. Go back to previous menu"+"\n"+
							"Enter the number choice(1-7):"
							);

					int choice = look.nextInt();

					if (choice == 1) {
						System.out.println(menuChoice);
					}
					else if(choice ==2) {
						menuChoice.talk();
					}
					else if(choice == 3) {
						menuChoice.walkUp();
					}
					else if(choice == 4) {
						menuChoice.walkDown();
					}
					else if(choice==5) {
						menuChoice.walkLeft();
					}
					else if(choice==6) {
						menuChoice.walkRight();
					}
					else if(choice==7) {
						limit1=1;
						menus=1;

					}
				}
			}

		}
	}

}
