package hw08;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This an object class for book, it obtains the title, name of author, ISBN number
 * and the number of pages. It cna also keep track of checkOut dates and dueDates
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Book {
	private String titleBook;
	private String firstAuthor;
	private String lastAuthor;
	private String iSBN;
	private int numPages;
	private LocalDate checkOut;
	private LocalDate dueDate;

	public Book() {

		this.titleBook="Insert";
		this.firstAuthor="First";
		this.lastAuthor="Last";
		this.iSBN="123456";
		this.numPages=0;

	}

	public Book(String titleBook, String firstAuthor, String lastAuthor, String iSBN, 
			int numPages) {

		this.titleBook=titleBook;
		this.firstAuthor=firstAuthor;
		this.lastAuthor=lastAuthor;
		this.iSBN=iSBN;
		this.numPages=numPages;

	}

	public String getTitleBook() {
		return titleBook;
	}

	public String getFirstAuthor() {
		return firstAuthor;
	}

	public String getLastAuthor() {
		return lastAuthor;
	}

	public String getISBN() {
		return iSBN;
	}

	public int getNumPages() {
		return numPages;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void checkOut() {

		this.checkOut= LocalDate.now();
		this.dueDate=checkOut.plusDays(14);

	}

	public void checkIn() {
		Random date1= new Random();
		Random date2= new Random();

		int day1= date1.nextInt(36);
		int day2= date2.nextInt(36);
		if(day1>day2) {
			LocalDate checkIn =this.checkOut.plusDays(day1-day2);
			Period numDaysBetween = Period.between(checkOut, checkIn);
			int days =numDaysBetween.getDays();
			String fines ="Fines:\t\t"+"$"+days+".00"+"\n";
			System.out.println(fines);
			this.checkOut=null;
			this.dueDate=null;
		}else{
			LocalDate checkIn= this.checkOut.plusDays(day2-day1);
			Period numDaysBetween = Period.between(checkOut, checkIn);
			int days =numDaysBetween.getDays();
			String fines ="Fines:\t\t"+"$"+days+".00"+"\n";
			System.out.println(fines);
			this.checkOut=null;
			this.dueDate=null;
		}
	}

	@Override
	public String toString() {
		String output="";
		output+="Title of Book:\t"+this.titleBook+"\n";
		output+="Name of Author\t"+this.firstAuthor+" "+
		this.lastAuthor+"\n";
		output+="ISBN:\t\t"+this.iSBN+"\n";
		output+="Num of Pages:\t"+this.numPages+"\n";
		output+="Checkout Date:\t"+this.checkOut+"\n";
		output+="Due Date\t"+this.dueDate+"\n";
		return output;
		
	}
	
	
}
