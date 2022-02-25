package hw08;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;

import java.util.Scanner;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: A menu that computes all the actions need for the library, such as adding new books and 
 * adding them to brand new files. 
 */

public class Main {
	public static void main(String[] args) throws FileNotFoundException, FileTypeException {
		BookList bList= new BookList();
		menu(bList);
		System.out.println("Program Over");
	}

	public static void menu(BookList bList) throws FileNotFoundException, FileTypeException{
		Scanner scan= new Scanner(System.in);
		int menus =1;
		int limiter = 0;
		while(limiter==0) {
			switch(menus) {
			case 1://used a case method to help switch between each menu 
				int limit = 0;
				while(limit==0) {

					System.out.println("\n"+"Select an option\n" +
							"1."+"Load a Book File"+"\n"+ 							
							"2."+"Exit Program \n"+
							"Enter the number choice (1-2)");
					int a= scan.nextInt();
					if (a == 1) {
						System.out.println("Enter File Path: ");

						String filePath = scan.next();

						File fileTemp= new File(filePath);

						try {

							BookList bList1 = BookReader.parseBookFile(fileTemp);
							bList=bList1;

						}catch(FileNotFoundException e){
							e.printStackTrace();
						}catch(FileTypeException e) {
							e.printStackTrace();
						}
						menus= 2;
						limit=1;
					}
					else if(a==2) {
						System.out.println("The program is closing.");
						System.exit(0);
					}
				}

			case 2:
				int limit1=0;
				while(limit1 ==0) {
					System.out.println("\n"+"Book Menu"+"\n"+
							"1. Save Book to File"+"\n"+
							"2. Add Book"+"\n"+
							"3. Find Book"+"\n"+
							"4. Checkout Book"+"\n"+
							"5. Checkin Book"+"\n"+
							"6. Return to Previous Menu"+"\n"+
							"Enter the number choice(1-6):"
							);

					int choice = scan.nextInt();

					if (choice == 1) {
						System.out.println("Enter File Path: ");
						scan.nextLine();
						String path = scan.nextLine();
						File outFile =new File(path);

						try {
							PrintWriter writer = new PrintWriter(outFile);

							for(int i=0; i<bList.size(); i++) {
								Book tempBook = bList.get(i);
								String title= tempBook.getTitleBook();
								String first= tempBook.getFirstAuthor();
								String last= tempBook.getLastAuthor();
								String iSBN= tempBook.getISBN();
								String pages= Integer.toString(tempBook.getNumPages());

								writer.println(title+","+first+","+last+","+iSBN+","+pages);
							}
							writer.close();
						}catch(FileNotFoundException e) {
							e.printStackTrace();
						}
					}
					if(choice ==2) {
						System.out.println("Enter Book Name:");
						scan.nextLine();
						String title = scan.nextLine();
						System.out.println("Enter First Name of Author");
						String firstName= scan.nextLine();
						System.out.println("Enter Last Name of Author");
						String lastName=scan.nextLine();
						System.out.println("Enter ISBN Number:");
						String iSBN=scan.nextLine();
						System.out.println("Enter The Number Of Pages The Book Has:");
						int numPages=scan.nextInt();
						Book b1= new Book(title,firstName,lastName, iSBN, numPages);
						bList.add(b1);
					}
					else if(choice == 3) {
						System.out.println("How Would You Like To Find The Book"+"\n"+
								"1. By Title"+"\n"+
								"2. By Author's Name"+"\n"+
								"3. By ISBN"+"\n"+
								"(Choose between number 1-3)");

						int searchChoice= scan.nextInt();
						if(searchChoice==1) {
							System.out.println("Enter the Name of the Book:");
							scan.nextLine();
							String tempTitle=scan.nextLine();
							Book bTemp= bList.getBookByTitle(tempTitle);
							System.out.println(bTemp);
						}
						else if(searchChoice==2) {
							System.out.println("Enter First Name of Author:");
							scan.nextLine();
							String tempFirst= scan.nextLine();
							System.out.println("Enter Last Name of Author:");
							String tempLast= scan.nextLine();
							BookList bListTemp= bList.getBookbyAuthors(tempFirst, tempLast);
							for(int i =0; i<bListTemp.size(); i++) {
								System.out.println("\n"+bListTemp.get(i));
							}

						}else if(searchChoice==3) {
							try{
								System.out.println("Enter ISBN Number: ");
								scan.nextLine();
								String tempISBN=scan.nextLine();
								Book tempBook= bList.getBookByISBN(tempISBN);
								System.out.println("\n"+tempBook);
							}catch(ISBNNumberFormatException e) {
								e.printStackTrace();
							}
						}
					}
						else if(choice ==4) {
							System.out.println("How Woould You Like To Search For The Book"+"\n"+
									"1.Title of Book"+"\n"+
									"2.ISBN"+"\n"+
									"Choose Between 1 or 2");
							int searchChoice=scan.nextInt();
							if(searchChoice == 1) {
								System.out.println("Enter Title of Book:");
								scan.nextLine();
								String tempTitle=scan.nextLine();
								Book bSearch=bList.getBookByTitle(tempTitle);
								bSearch.checkOut();
								System.out.println("Checked Out On: "+bSearch.getCheckOut()+"\n"+"Due On: "+bSearch.getDueDate());
							}
							else if(searchChoice ==2) {
								System.out.println("Enter ISBN of Book:");
								scan.nextLine();
								String tempISBN=scan.nextLine();
								Book bSearch=bList.getBookByISBN(tempISBN);
								bSearch.checkOut();
								System.out.println("Checked Out On: "+bSearch.getCheckOut()+"\n"+"Due On: "+bSearch.getDueDate());
							}
						}
						else if (choice ==5) {
							System.out.println("How Woould You Like To Search For The Book"+"\n"+
									"1.Title of Book"+"\n"+
									"2.ISBN"+"\n"+
									"Choose Between 1 or 2");
							int searchChoice=scan.nextInt();
							if(searchChoice == 1) {
								System.out.println("Enter Title of Book:");
								scan.nextLine();
								String tempTitle=scan.nextLine();
								Book bSearch=bList.getBookByTitle(tempTitle);
								bSearch.checkIn();

							}
							else if(searchChoice ==2) {
								System.out.println("Enter ISBN of Book:");
								scan.nextLine();
								String tempISBN=scan.nextLine();
								Book bSearch=bList.getBookByISBN(tempISBN);
								bSearch.checkIn();


							}
						}

						else if(choice==6) {
							limit1=1;
							menus=1;

						}

					}
				}

			}
		}
	}
