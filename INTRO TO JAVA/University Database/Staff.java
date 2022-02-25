package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
import java.util.ArrayList;

public class Staff extends Employee{
	private String jobTitle;

	public Staff(String firstName, String lastName, String email, 
			Address address, ArrayList<PhoneNumber> phoneNumber,String officeLoc, double salary,String jobTitle) {
		super(firstName, lastName, email, address,phoneNumber,officeLoc,salary);
		this.jobTitle=jobTitle;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public boolean equals(Object stuff) {
		if(!(stuff instanceof Staff)) {
			return false;
		}
		Staff temp =(Staff)stuff;

		boolean isParentEq = super.equals(stuff);
		boolean isJobTitle = this.jobTitle == temp.jobTitle;

		return isParentEq && isJobTitle;
	}
	public String toString() {
		String output="";

		output+=super.toString();
		output+="Job Title:\t"+jobTitle+"\n";
		return output;
	}
}
