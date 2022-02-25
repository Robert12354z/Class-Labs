package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
import java.util.*;
public class Tester {
	public static void main(String[] args) {
		Address a1= new Address(123,"Seasame Street","New York","New York","000001");
		Address a2= new Address(1212,122,"Wall Street","Los Angeles","California","20202");
		ArrayList<PhoneNumber> pn1=new ArrayList<PhoneNumber>();
		PhoneNumber pn2=new PhoneNumber("home",523,232,2313);
		PhoneNumber pn3=new PhoneNumber("Work",776,121,2232);
		pn1.add(pn2);
		pn1.add(pn3);
		Person p1=new Person("Robert","Reyes","rreyes8@calstatela.edu",a1,pn1);
		Employee e1= new Employee("Rubert","Barry","dshfgkljsdh@gmail.com",a1,pn1,"Staff Building",100000);
		Student s1= new Student("Felix","Marx","dfjlskdj@hhsh.com",a1,pn1,"Junior",3.23);
		Student s2= new Student("John","Denimn","dsfj@ddd.com",a1,pn1,"Freshman",2.0);
		Student s3= new Student("Salk","Fate","salt.fate@food.com",a1,pn1,"Senior",3.56);
		Student s4= new Student("Erny","Hop","ewrqqq@iuerowu.com",a1,pn1,"Sophmore",1.23);
		Student s5= new Student("Dfskjl","Vxbx","henrt@fsdkjl.com",a1,pn1,"Sophmore",2.19);
		Faculty f1= new Faculty("Robert","Lucas","dfkkk@email.com",a1,pn1, "ET Building", 150000,"8:00 am to 9:00 pm","Part-Time");
		Faculty f2= new Faculty("Ron","Elroy","sfajklhd@gmail.com",a1,pn1,"King Hall",10,"9:00 pm to 9:00 pm","Full-Time");
		Faculty f3= new Faculty("Henry","Hen","HenHenry@yahoo.com",a1,pn1,"Bio Building",0,"8:00 am to 8:00 pm","Full-Time");
		Faculty f4= new Faculty("Bob","Bobert","BobBerhh@mail.com",a1,pn1,"Ban Spot",1,"8:00 am to 2:00 pm","Part-Time");
		Faculty f5 = new Faculty("Tom","Tomers","TommyTom@tom.com",a1,pn1,"Tom Building",15.45,"10:00am to 11:00pm"+"Full-Time", null);
		Staff sf1= new Staff("Robert","Lucas","dfkkk@email.com",a1,pn1, "ET Building", 10,"Teacher");
		Staff sf2 = new Staff("Young","Blood","Bloo.Fun@fun.com",a2,pn1,"ET Building",0,"Cleaner");
		Staff sf3=new Staff("Baln","Hensa","WitcherOnSwitch@games.net",a2,pn1,"Hen House",111110,"Cook");
		Staff sf4=new Staff("Bat","Man","Batman@Batman.com",a2,pn1,"BatCave",929292,"Hero");
		Staff sf5 =new Staff("Super","Man","Superman@metropolis.com",a2,pn1,"Chamber of Solitude", 19999999, "Hero");
		Database db1=new Database();
		db1.add(s1);
		db1.add(sf3);
		db1.add(s2);
		db1.add(f1);
		db1.add(f2);
		db1.add(sf2);
		db1.add(s5);
		db1.add(f4);
		db1.add(s3);
		db1.add(sf5);
		db1.add(s2);
		db1.add(sf4);
		db1.add(f3);
		db1.add(s4);
		db1.add(f5);

		int c=0;
		for(int i =0; i<db1.size(); i++) {
			System.out.println(db1.get(i));
			c++;
		}
		System.out.println("------------");
		System.out.println("Number of prints: "+c);
		System.out.println("------------");
		db1.printEmployees();
		System.out.println("------------");
		db1.printFaculty();
		System.out.println("------------");
		db1.printStudents();
		System.out.println("------------");
		db1.printStaff();
		System.out.println("------------");
		System.out.println(db1.getNumberOfPeople());
		System.out.println(db1.getNumberOfEmployees());
		System.out.println(db1.getNumberOfStudents());
		System.out.println(db1.getNumberOfStaff());
		System.out.println(db1.getNumberOfFaculty());
		System.out.println("------------");
		System.out.println(db1.getNumberOfStudentsByClassStanding());
		System.out.println("------------");
		db1.printStudentsGreaterThanOrEqualToGPA(2.0);
		db1.printStudentsLessThanOrEqualToGPA(2.0);
		System.out.println(p1);
		System.out.println(e1);
		System.out.println(s1);
		System.out.println(f1);
		System.out.println(sf1);
		System.out.println(p1.equals(sf1));
		System.out.println(p1.equals(p1));
		System.out.println(sf1.equals(p1));
		System.out.println(sf1.equals(sf1));
		System.out.println(e1.equals(e1));
		System.out.println(a1.equals(a1));
		System.out.println(pn2.equals(pn3));
	}
}
