package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
import java.util.*;

public class Database extends ArrayList<Person> {

	public Database() {
	}

	public Database(ArrayList<Person> lists) {
		super(lists);
	}

	public void printEmployees() {

		for(int i =0; i<super.size(); i++) {
			if(super.get(i) instanceof Employee) {
				System.out.println(super.get(i));
			}
		}
	}
	public void printStudents() {

		for(int i =0; i<super.size(); i++) {
			if(super.get(i) instanceof Student) {
				System.out.println(super.get(i)); 
			}
		}
	}
	public void printFaculty() {
		for(int i =0; i<super.size(); i++) {
			if(super.get(i) instanceof Faculty) {
				System.out.println(super.get(i));
			}
		}
	}
	public void printStaff() {
		for(int i =0; i<super.size(); i++) {
			if(super.get(i) instanceof Staff) {
				System.out.println(super.get(i));
			}
		}
	}
	public int getNumberOfPeople() {
		int num=0;
		num=super.size();
		return num;
	}

	public int getNumberOfStudents() {
		int num =0;
		for(int i =0; i<super.size(); i++) {
			if(super.get(i) instanceof Student) {
				num++;
			}
		}
		return num;
	}
	public int getNumberOfEmployees() {
		int num =0;
		for(int i =0; i<super.size(); i++) {
			if(super.get(i) instanceof Employee) {
				num++;
			}
		}
		return num;
	}
	public int getNumberOfStaff() {
		int num =0;
		for(int i =0; i<super.size(); i++) {
			if(super.get(i) instanceof Staff) {
				num++;
			}
		}
		return num;
	}
	public int getNumberOfFaculty() {
		int num =0;
		for(int i =0; i<super.size(); i++) {
			if(super.get(i) instanceof Faculty) {
				num++;
			}
		}
		return num;
	}

	public String getNumberOfStudentsByClassStanding() {
		int junior=0;
		int freshman=0;
		int senior=0;
		int sophmore=0;

		for(int i=0; i<super.size(); i++) {
			if(super.get(i) instanceof Student) {
				Student temp= (Student) super.get(i);
				if(temp.getClassStanding().toLowerCase().equals("freshman")) {
					freshman++;
				}
				if(temp.getClassStanding().toLowerCase().equals("sophmore")) {
					sophmore++;
				}
				if(temp.getClassStanding().toLowerCase().equals("junior")) {
					junior++;
				}
				if(temp.getClassStanding().toLowerCase().equals("senior")) {
					senior++;
				}
			}
		}
		String output = "Freshman:\t"+freshman+"\n"+"Sophmore:\t"+sophmore+"\n"+"Junior:\t"+junior+"\n"+"Senior:\t"+senior+"\n";
		return output;

	}
	public void printStudentsGreaterThanOrEqualToGPA(double GPA) {
		for(int i=0; i<super.size(); i++) {
			if(super.get(i) instanceof Student) {
				Student temp= (Student) super.get(i);
				if(temp.getGPA()>=GPA) {
					System.out.println(super.get(i));
				}
			}
		}


	}
	public void printStudentsLessThanOrEqualToGPA(double GPA) {
		for(int i=0; i<super.size(); i++) {
			if(super.get(i) instanceof Student) {
				Student temp= (Student) super.get(i);
				if(temp.getGPA()<=GPA) {
					System.out.println(super.get(i));
				}
			}
		}

	}
	public String toString() {
		String output="";
		output+=super.toString();
		return output;

	}
}
