/* Name: Roberto Reyes
 * CIN: 306807805
 * Course & Section: CS2012 Sections 01 & 02 (Use your correct section numbers)
 * Description: The program creates a quiz and makes the user take the quiz through the main class menu.
 */
package hw05;
import quiz.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		/*
    -Place this class in the hw05 package.
    -In your main class, create a Quiz with at least 10 questions.  5 questions must be fill in the blank, and 5 must be multiple choice.  Provide a menu system to allow the user to take your quiz. 
    -For a multiple choice question, the user will enter the letter corresponding to their response to the question.
    -NOTE: The user should able to enter an uppercase OR lowercase letter.
    -For a fill in the blank question, the user will type their answer.  Answers may contain more than one word, so be sure to read the input correctly.  Also, the answer must be exact to be correct, however, capitalization of words should be disregarded.  Example: if the correct answer is Java, the user should be able to enter java, Java, JAVA, JaVa, etc... and still be given credit for having the correct answer.
    -Allow the user to take the quiz and show their final score.
    -Your menu for this class should follow the normal procedures for writing a user menu.
    -Your main class must be modular (i.e. you must break it into proper methods as you learned in CS2011 or no credit will be given.)
		 */
		ArrayList<Question> q1= new ArrayList<Question>(); 	
		MCQuestion mcq1 = new MCQuestion("Which of the following is a programning language?");
		mcq1.addAnswer("C--",false);
		mcq1.addAnswer("Cobra",false);
		mcq1.addAnswer("Java", true);
		mcq1.addAnswer("Blue",false);
		q1.add(mcq1);
		FiBQuestion fibq1= new FiBQuestion("Java is a _programming_ language");
		q1.add(fibq1);
		FiBQuestion fibq2= new FiBQuestion("We are learning _Java_ in Keenan's Class");
		q1.add(fibq2);
		FiBQuestion fibq3= new FiBQuestion("The author _Stephen King_ wrote the book IT");
		q1.add(fibq3);
		FiBQuestion fibq4= new FiBQuestion("The Beatles are a _British_ band");
		q1.add(fibq4);
		FiBQuestion fibq5= new FiBQuestion("Diablo is a _mobile_ game");
		q1.add(fibq5);
		MCQuestion mcq2= new MCQuestion("Which of the following is a mobile RPG genre game?");
		mcq2.addAnswer("Diablo",true);
		mcq2.addAnswer("Where's my Water",false);
		mcq2.addAnswer("Angry Birds", false);
		mcq2.addAnswer("Clash of Clans", false);
		q1.add(mcq2);
		MCQuestion mcq3= new MCQuestion("Which character is a Tank in Overwatch?");
		mcq3.addAnswer("Tracer", false);
		mcq3.addAnswer("Soldier 76", false);
		mcq3.addAnswer("Hanzo",false);
		mcq3.addAnswer("Winston", true);
		q1.add(mcq3);
		MCQuestion mcq4= new MCQuestion("Who is the fastest videogame character?");
		mcq4.addAnswer("Mario",false);
		mcq4.addAnswer("Sonic",true);
		mcq4.addAnswer("Conker", false);
		mcq4.addAnswer("Crash Bandicoot", false);
		q1.add(mcq4);
		MCQuestion mcq5= new MCQuestion("Which is a type of cookie?");
		mcq5.addAnswer("Brick", false);
		mcq5.addAnswer("Meat",false);
		mcq5.addAnswer("Oatmeal", true);
		mcq5.addAnswer("Poop", false);
		q1.add(mcq5);
		Quiz a1= new Quiz(q1);
		menu(a1);		
	}
	public static void menu(Quiz a1) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Take Quiz: Y/N");
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("Y")) {
			a1.takeQuiz();
			System.out.println("\n");
			a1.gradeQuiz();
		}
		else if(a.equalsIgnoreCase("N")) {
			System.exit(0);
		}
	}
}





