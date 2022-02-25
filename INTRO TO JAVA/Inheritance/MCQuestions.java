/* Name: Roberto Reyes
 * CIN: 306807805
 * Course & Section: CS2012 Sections 01 & 02 (Use your correct section numbers)
 * Description: The MCQuestion test is a 
 */
package quiz;
/*
    Place this class in the quiz package.
    NOTE: This class is a subclass of the Question class and will handle multiple choice questions with only one possible answer.
    Datafields:
        An ArrayList to store the possible choices for a multiple choice question.
    Constructors:
        A constructor which takes the question text as a parameter and initializes the ArrayList data field to be an empty ArrayList.
            HINT: Think of where you need to send the question text.
            NOTE: The values in the ArrayList will be assigned in the method below.
    Methods:
        A method (name it what you want) that takes a String and a boolean.  The String is a possible answer to the multiple choice question and the boolean indicates whether or not that given answer is the correct one.  Take the string and add it to the ArrayList.
            NOTE: If the boolean is true, this is the answer to the question and the correct letter (a, b, c, d), etc. should be assigned as the answer for this question (remember that answer is a data field in the parent).
            NOTE: Letter "a." corresponds to index 0 of the ArrayList, letter "b." corresponds to index 1 of the ArrayList.  To assign the answer, keep track of how many previous answers were added to the ArrayList and figure out the correct letter based on that.
                EXAMPLE: MCQuestion mcq1 = new MCQuestion("Which of the following is a programming language?");
                                   mcq1.addAnswer("C--", false);
                         mcq1.addAnswer("Cobra", false);
                         mcq1.addAnswer("Java", true);
                         mcq1.addAnswer("Blue", false);
                Here, the third addAnswer invocation would assign the letter "c" as the answer to the question because this was the third answer added and it was the correct one (indicated by the boolean value true).
                HINT: Recall that the char data type can be incremented or decremented using the ++ or -- operators.
                    Example:  char ch = 'a';
                            ch++;
                            System.out.println(ch); //this would print the letter b
                    You may want to keep a private data field in your MCQuestion class which helps you keep track of what letter you are on so that when the correct answer is entered, you can compute the letter easily.              
        Override the toString() method to show the question, and the list of possible answers (with corresponding letter before each answer).
            Example: Using the previous example, if I were to print mcq1, I should see something like:
                    Which of the following is a programming language?
                  a. C--
                  b. Cobra
                  c. Java
                  d. Blue
 */
import java.util.ArrayList;

public class MCQuestion extends Question {
	private ArrayList<String> multiAnswer;

	public MCQuestion(String question){
		super.setQuestion(question);
		ArrayList<String> multiAnswer = new ArrayList<String>();
		this.multiAnswer=multiAnswer;
	}
	public void addAnswer(String answer, boolean rightAnswer) {
		this.multiAnswer.add(answer);

		if(rightAnswer == true) {
			String b = answer;
			int num =this.multiAnswer.indexOf(b);
			char ch = 'a';
			ch+=num;
			String correct= Character.toString(ch);
			super.setAnswer(correct);

		}
	}
	public String toString() {
		String output="";
		output+= super.toString()+"\n";
		char ch ='a';
		for(int i=0; i<multiAnswer.size(); i++) {
			output+= ch+".  "+ multiAnswer.get(i)+"\n"; 
			ch++;
		}
		return output;
	}
}
