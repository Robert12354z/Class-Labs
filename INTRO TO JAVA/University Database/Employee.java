package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
import java.util.ArrayList;

public class Employee extends Person{

	private String officeLoc;
	private double salary;

	public Employee(String firstName, String lastName, String emailAddress, 
			Address address, ArrayList<PhoneNumber> phoneNumbers,String officeLoc, double salary) {
		super(firstName,lastName,emailAddress,address,phoneNumbers);
		this.officeLoc=officeLoc;
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOfficeLoc() {
		return officeLoc;
	}

	public void setOfficeLoc(String officeLoc) {
		this.officeLoc = officeLoc;
	}
	@Override
	public boolean equals(Object stuff) {
		if(!(stuff instanceof Employee)) {
			return false;
		}
		Employee temp=(Employee) stuff;

		boolean isParentEq = super.equals(stuff);
		boolean isOfficeLoc= this.officeLoc == temp.officeLoc;
		boolean isSalary= this.salary == temp.salary;

		return isParentEq && isOfficeLoc && isSalary;
	}

	@Override
	public String toString() {
		String output="";
		output+=super.toString();
		output+="Office Location:"+officeLoc+"\n";
		output+="Salary:\t\t"+"$"+salary+" a year"+"\n";
		return output;

	}


}
