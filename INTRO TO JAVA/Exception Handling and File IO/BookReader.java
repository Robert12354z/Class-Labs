package hw08;

import java.util.*;
import java.io.*;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: Checks to split csv files that can create temporary virtual libraries for the main class to read.
 */
public class BookReader{
	private BookReader() {
	}
	public static BookList parseBookFile(File fileTemp) throws FileTypeException, FileNotFoundException{
		File fileRead=fileTemp;
		String check =fileRead.getName();
		String copy =check;
		System.out.println(copy);
	
		BookList bL1= new BookList();
		try {
			if(!copy.contains("csv")) {
				throw new FileTypeException("Wrong File Type, Only CSV");
			}
			Scanner reader= new Scanner(fileTemp);
			while(reader.hasNextLine()){
				String line = reader.nextLine();
				String[] tokens = line.split(",");

				//tokens[0] = title
				//tokens[1] = First Name
				//tokens[2] = Last Name
				//tokens[3] = ISBN
				//tokens[4] = Number of Pages

				String title = tokens[0];
				String firstName= tokens[1];
				String lastName=tokens[2];
				String iSBN= tokens[3];
				int pageNumbers= Integer.parseInt(tokens[4]);

				Book b1= new Book(title,firstName,lastName,
						iSBN,pageNumbers);

				bL1.add(b1);

			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(FileTypeException e) {
			 e.printStackTrace();
		}
		return bL1;

	}
}
