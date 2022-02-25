/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 */
package hw07;
import java.util.*;

public class Main {
	public static void main(String Args[]) {
		ArrayList<Money> monList1= new ArrayList<Money>();
		ArrayList<Money> monList2= new ArrayList<Money>();
		ArrayList<Time>	 timeList1=new ArrayList<Time>();
		ArrayList<Time>	 timeList2=new ArrayList<Time>();

		Money m1 = new Money(12,34);
		Money m2=new Money(15,67);
		Money m3= new Money(999,95);
		Money m4= new Money(10000000,99);
		Money m5= new Money(-1000,95);
		Money m6= new Money(55,56);
		Money m7= new Money(46,23);
		Money m8= new Money(19,00);
		Money m9= new Money (23,23);
		Money m10= new Money();

		monList1.add(m1);
		monList1.add(m2);
		monList1.add(m3);
		monList1.add(m4);
		monList1.add(m5);
		monList2.add(m6);
		monList2.add(m7);
		monList2.add(m8);
		monList2.add(m9);
		monList2.add(m10);


		Time t1= new Time(20,2,20);
		Time t2= new Time(12,10,5);
		Time t3= new Time(13,14,54);
		Time t4= new Time(01,23,3);
		Time t5= new Time(3,4,53);
		Time t6= new Time(12,13,45);
		Time t7= new Time(12,45,67);
		Time t8=new Time(76,23,45);
		Time t9=new Time(98,12,15);
		Time t10=new Time(45,12,32);
		timeList1.add(t1);
		timeList2.add(t2);
		timeList1.add(t3);
		timeList2.add(t4);
		timeList1.add(t5);
		timeList2.add(t6);
		timeList1.add(t7);
		timeList2.add(t8);
		timeList1.add(t9);
		timeList2.add(t10);


		Collections.shuffle(monList1);
		Collections.shuffle(monList2);
		Collections.shuffle(timeList1);
		Collections.shuffle(timeList2);

		addMoney(monList1,monList2);
		subMoney(monList1,monList2);
		addTime(timeList1,timeList2);
		subTime(timeList1,timeList2);


	}
	public static void addMoney (ArrayList<Money> monList1, ArrayList<Money> monList2){
		ArrayList<Money> monList3= new ArrayList<Money>();
		System.out.println("Addition of Money:");
		for(int i =0; i<monList1.size(); i++) {
			Money temp = monList1.get(i);
			Money temp2= monList2.get(i);
			monList3.add(temp.add(temp2));
			System.out.println(monList3.get(i));
		}
		System.out.println("\n"+"Addition of Money Sorted:");
		Collections.sort(monList3);
		for(int i =0; i<monList3.size(); i++) {
			System.out.println(monList3.get(i));
		}
	}
	public static void subMoney (ArrayList<Money> monList1, ArrayList<Money> monList2){
		ArrayList<Money> monList4 = new ArrayList<Money>();
		System.out.println("\n"+ "Subtraction of Money:");
		for(int i =0; i<monList1.size(); i++) {
			Money temp = monList1.get(i);
			Money temp2 = monList2.get(i);
			Money temp3 = temp.subtract(temp2);
			if(temp3.getCents()<0) {
				int tempCents=temp3.getCents()*-1;
				temp3.setCents(tempCents);
				monList4.add(temp3);
			}else {
				monList4.add(temp3);
			}
			System.out.println(monList4.get(i));
		}
		System.out.println("\n"+ "Subtraction of Money Sorted:");
		Collections.sort(monList4);
		for(int i =0; i<monList4.size(); i++) {
			System.out.println(monList4.get(i));
		}
	}
	public static void  addTime (ArrayList<Time> timeList1,ArrayList<Time> timeList2){
		ArrayList<Time>timeList3= new ArrayList<Time>();
		System.out.println("\n"+"Addition of Time:");
		for(int i =0; i<timeList1.size(); i++) {
			Time temp= timeList1.get(i);
			Time temp2=timeList2.get(i);
			timeList3.add(temp.add(temp2));
			System.out.println(timeList3.get(i));
		}
		System.out.println("\n"+"Addition of Time Sorted:");
		Collections.sort(timeList3);
		for(int i =0; i<timeList3.size(); i++) {
			System.out.println(timeList3.get(i));
		}
	}

	public static void subTime(ArrayList<Time> timeList1,ArrayList<Time> timeList2){
		ArrayList<Time>timeList4= new ArrayList<Time>();
		System.out.println("\n"+"Subtraction of Time:");
		for(int i =0; i<timeList1.size(); i++) {
			Time temp= timeList1.get(i);
			Time temp2=timeList2.get(i);
			Time temp3=temp.subtract(temp2);
			timeList4.add(temp3);
		
		System.out.println(timeList4.get(i));
	}
	System.out.println("\n"+"Subtraction of Time Sorted:");
	Collections.sort(timeList4);
	for(int i =0; i<timeList4.size(); i++) {
		System.out.println(timeList4.get(i));
	}
}
}
