/* Name: Roberto Reyes
 * CIN: 306807805
 * Course & Section: CS2012 Sections 01 & 02 (Use your correct section numbers)
 * Description: The class quiz computes the question objects that are sent to this class, then it
 * computes the objects witin the quiz class. 
 */
package quiz;
import java.util.*;

/*
    Place this class in the quiz package.
    NOTE: This class is not related to any of the other classes using inheritance.
    Datafields:
        -An ArrayList of Question objects which make up the questions of the quiz.
            NOTE: This class only has ONE ArrayList of questions.  Because of inheritance, it is entirely possible to create an ArrayList of a parent class type and store different child types inside of this ArrayList.  This is releated to polymorphism, which we will discuss next week.  All this to say it is possible to store MCQuestions and FiBQuestions inside of an ArrayList that stores Questions.
        -Another ArrayList of Strings, to store the user responses to each question.
    -Provide any necessary Constructors, getters, setters.
    -Methods:
   	-A method to take the quiz.  Each question should be displayed in the console, and the answer recorded.
    -Once the quiz is finished, grade the quiz and display the score as a percentage out of 100%  Each question is worth 1 point.
 */
public class Quiz {
	private ArrayList<Question> questions;
	private ArrayList<String> responses;

	public Quiz(ArrayList<Question> question) {
		this.questions=question;
		this.responses= new ArrayList<String>();
	}
	public ArrayList<Question> getQuestion(){
		return questions;
	}
	public ArrayList<String> getResponses(){
		return responses; 
	}
	public void setQuestion(ArrayList<Question> question) {
		this.questions=question;
	}
	public void takeQuiz() {
		Scanner scan= new Scanner(System.in);
		for(int i=0; i<questions.size(); i++) {
			System.out.println(questions.get(i));
			String response= scan.nextLine();
			this.responses.add(response);
		}
		scan.close();
	}
	public void gradeQuiz() {

		double count=0.00;
		double questCount=0.00;
		for(int i=0; i<responses.size(); i++) {
			questCount++;
			boolean test= questions.get(i).grade(responses.get(i));
			if(test == true) {
				count++;
			}else {
				continue;

			}
		}

		System.out.println("Grade: "+ count/questCount*100+ "%");
	}
}
