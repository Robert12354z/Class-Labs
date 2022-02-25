package hw08;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: An exception class that is unchecked.
 */
public class ISBNNumberFormatException extends RuntimeException{
	
	public ISBNNumberFormatException() {
		super();
	}
	public ISBNNumberFormatException(String msg) {
		super(msg);
	}

}
