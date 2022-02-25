/* Name: Roberto Reyes
 * CIN: 306807805
 * Course & Section: CS2012 Sections 01 & 02 (Use your correct section numbers)
 * Description: The program takes a quiz string and splits the answer from the question string
 */
package quiz;
/*
    Place this class in the quiz package.
    NOTE: This class is a subclass of the Question class and will handle fill in the blank type questions.
    Datafields: No data fields are necessary.
    Constructors:
        A constructor which takes ONLY the question in the following format: "Java is a _statically typed_ language". 
            This constructor should take the question and parse out the answer (which is denoted using underscores.) 
            When the question is displayed it should be shown as "Java is a ___________________________ language."
            NOTE: If the given String is not in the correct format (must have an underscore on each side of the answer).  Display an error message.
            HINT: Look at the methods from the String class.
            HINT: Think of where the formatted question should be sent.
    Methods:
        A private method to take the input String and help parse the answer from the given question.
        Override the toString method to display the question with the answer removed.
 */

public class FiBQuestion extends Question {
	private String[] tokens;
	public FiBQuestion(String question) {
		super.setQuestion(question);	
		String[] tokens= new String[3];
		removeAnswer();
	}
	private void removeAnswer() {

		String questionAnswer= super.getQuestion();
		tokens= questionAnswer.split("_");
		if(tokens.length != 3) {
			System.out.print("ERROR: Format Error");
		}else {

			String part1= tokens[0];
			String part3= tokens[2];
			super.setAnswer(tokens[1]);
			String question = part1+"____________"+part3;
			super.setQuestion(question);
		}
	}
	public String toString() {
		String output="";
		output += tokens[0]+"____________"+tokens[2];
		return output;	

	}
}
