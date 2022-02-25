package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
import java.util.ArrayList;

public class Student extends Person {

	private String classStanding;
	private double gpa;

	public Student(String firstName, String lastName, String email, 
			Address address, ArrayList<PhoneNumber> phoneNumber, String classStanding, double gpa) {
		super(firstName, lastName, email, address, phoneNumber);
		this.classStanding=classStanding;
		this.gpa=gpa;		
	}

	public String getClassStanding() {
		return classStanding;
	}

	public void setClassStanding(String classStanding) {
		if(classStanding=="Freshman"|| classStanding=="Sophmore"||classStanding=="Junior"||classStanding=="Senior") {
			this.classStanding = classStanding;
		}
		else {
			System.out.println("Error");
		}
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gPA) {
		gpa = gPA;
	}

	@Override
	public boolean equals(Object stuff) {
		if(!(stuff instanceof Student)) {
			return false;
		}
		Student temp = (Student)stuff;

		boolean isParentEq = super.equals(stuff);
		boolean isClassStanding=  this.classStanding == temp.classStanding;
		boolean isGPA= this.gpa == temp.gpa;

		return isParentEq && isClassStanding && isGPA;
	}

	@Override
	public String toString() {
		super.toString();
		String output="";
		output+=super.toString();
		output+="Class Standing:\t"+classStanding+"\n";
		output+="GPA:\t\t"+gpa+"\n";
		return output;
	}

}
