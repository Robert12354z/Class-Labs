package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
import java.util.ArrayList;

public class Faculty extends Employee {
	private String officeHours;
	private String rank;

	public Faculty(String firstName, String lastName, String email, Address address, ArrayList<PhoneNumber> phoneNumber,
			String officeLoc, double salary, String officeHours,String rank){

		super(firstName, lastName, email, address, phoneNumber,officeLoc,salary);

		this.officeHours=officeHours;
		this.rank=rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	public boolean equals(Object stuff) {
		if(!(stuff instanceof Faculty)) {
			return false;
		}
		Faculty temp = (Faculty)stuff;

		boolean isParentEq= super.equals(stuff);
		boolean isOfficeHours= this.officeHours == temp.officeHours;
		boolean isRank= this.rank == temp.rank;

		return isParentEq && isOfficeHours && isRank;
	}
	public String toString() {
		String output="";
		output+=super.toString();
		output+="Office Hours:\t"+officeHours+"\n";
		output+="Rank:\t\t"+rank+"\n";
		return output;

	}
}
