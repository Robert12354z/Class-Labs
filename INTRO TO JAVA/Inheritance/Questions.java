/* Name: Roberto Reyes
 * CIN: 306807805
 * Course & Section: CS2012 Sections 01 & 02 (Use your correct section numbers)
 * Description: A parent class that effects the MCQuestion Class and FiBQuestion Class. 
 * 				It essentially saves the question and checks to see if the answer is true or false
 */
package quiz;

public class Question {
	private String question;
	private String answer;

	public Question(){
		this.question="";
		this.answer="";
	}
	public Question(String question, String answer) {
		this.question=question;
		this.answer=answer;
	}

	public String getQuestion() {
		return this.question;
	}
	public String getAnswer() {
		return this.answer;
	}
	public void setQuestion(String question) {
		this.question=question;
	}
	public void setAnswer(String answer) {
		this.answer=answer;
	}
	public boolean grade(String userAnswer){
		if(answer.equalsIgnoreCase(userAnswer)) {
			return true;
		}else {
			return false;
		}

	}
	public String toString() {
		String output="";
		output += "Question: "+ question;
		return output;
	}
}
