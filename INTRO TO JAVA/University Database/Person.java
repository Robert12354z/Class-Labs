package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
import java.util.*;
public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	private ArrayList<PhoneNumber> phoneNumber;

	public Person(String firstName, String lastName, String email, 
			Address address, ArrayList<PhoneNumber> phoneNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.address=address;
		this.phoneNumber=phoneNumber;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setAddress(Address address) {
		this.address=address;	
	}
	public void setPhoneNumber(ArrayList<PhoneNumber> phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public Address getAddress() {
		return address;
	}
	public ArrayList<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Person)) {
			return false;
		}
		Person temp = (Person)other;

		if(this.address == null || this.firstName == null || this.lastName == null
				|| this.phoneNumber== null|| this.email== null|| temp.address == null|| 
				temp.firstName== null|| temp.lastName== null|| temp.phoneNumber== null|| temp.email== null) {
			return false;
		}
		boolean isAddress = this.address == temp.address;
		boolean isFirstName= this.firstName == temp.firstName;
		boolean isLastName= this.lastName == temp.lastName;
		boolean isPhoneNumber= this.phoneNumber == temp.phoneNumber;
		boolean isEmail=this.email == temp.email;

		return isAddress && isFirstName && isLastName && isPhoneNumber && isEmail;
	}
	@Override
	public String toString() {

		String output="";
		output+="Name:\t\t"+firstName+" "+lastName+"\n";
		output+="Email:\t\t"+email+"\n";
		output+= address+"\n";
		output+="PhoneNumber(s): ";
		for(int i =0; i< phoneNumber.size();i++) {
			PhoneNumber nun= phoneNumber.get(i);
			output+=nun+"\n";
			output+="\t\t";
		}
		output+="\n";
		return output;
	}



}

