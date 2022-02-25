package hw08;

import java.util.ArrayList;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: An arraylist for the book object, this checks for books within a hypothetical library
 */
public class BookList extends ArrayList<Book> {

	public BookList() {
		super();
	}
	public void addBook(Book b1) {
		super.add(b1);
	}

	public Book getBookByTitle(String title) {
		Book b1 = null;
		for(int i =0; i<super.size(); i++) {
			b1 = super.get(i);
			if(b1.getTitleBook().equalsIgnoreCase(title)) {
				return b1;
			}

		}
		return b1;
	}

	public BookList getBookbyAuthors(String firstAuthor, String lastAuthor) {
		BookList bList = new BookList();
		Book b1 = null;
		for(int i =0; i<super.size(); i++) {
			b1=super.get(i);
			if(b1.getFirstAuthor().equalsIgnoreCase(firstAuthor) && b1.getLastAuthor().equalsIgnoreCase(lastAuthor)){
				bList.add(b1);
			}
		}

		return bList;
	}
	public Book getBookByISBN(String iSBN)  {
		int length = iSBN.length();
		if(length == 10|| length ==13) {
			if(iSBN.matches("[0-9]+")) {		
				for(int i =0; i<super.size(); i++) {
					Book b1 = super.get(i);
					if(b1.getISBN().matches(iSBN)) {
						return b1;
					}
					else {
						continue;
					}
				}
			}else {
				throw new  ISBNNumberFormatException("Invalid Format");
			}

		}
		return null;
	}
}
