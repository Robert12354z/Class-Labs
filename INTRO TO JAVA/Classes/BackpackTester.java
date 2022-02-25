
public class BackpackTester {

	public static void main(String[] args) {

		Backpack Jansport = new Backpack();
		Backpack Swiss= new Backpack("Swiss",true,2,3,4);
		Jansport.openBackpack();
		System.out.println("Zipper: "+ Jansport.getZipper());
		Jansport.addBooks();
		System.out.println("Books:   "+ Jansport.getBooks());
		Jansport.removeBooks();
		System.out.println("Books:   "+ Jansport.getBooks());
		Jansport.addFolders();
		System.out.println("Folders: "+Jansport.getFolders());
		Jansport.removeFolders();
		System.out.println("Folders: "+Jansport.getFolders());
		Jansport.addPencils();
		System.out.println("Pencils: " +Jansport.getPencils());
		Jansport.removePencils();
		System.out.println("Pencils: " +Jansport.getPencils());
		Jansport.closeBackpack();
		System.out.println("Zipper: "+Jansport.getZipper());
		Jansport.addBooks();
		System.out.println("Books:   "+ Jansport.getBooks());
		Jansport.removeBooks();
		System.out.println("Books:   "+ Jansport.getBooks());
		Jansport.addFolders();
		System.out.println("Folders: "+Jansport.getFolders());
		Jansport.removeFolders();
		System.out.println("Folders: "+Jansport.getFolders());
		Swiss.addBooks();
		System.out.println("Books:   "+ Swiss.getBooks());
		Swiss.removeBooks();
		System.out.println("Books:   "+ Swiss.getBooks());
		Swiss.addFolders();
		System.out.println("Folders: "+Swiss.getFolders());
		Swiss.removeFolders();
		System.out.println("Folders: "+Swiss.getFolders());
		Swiss.addPencils();
		System.out.println("Pencils: " +Swiss.getPencils());
		Swiss.removePencils();
		System.out.println("Pencils: "+Swiss.getPencils());
		Swiss.closeBackpack();
		Swiss.addBooks();
		System.out.println("Books:   "+ Swiss.getBooks());
		Swiss.removeBooks();
		System.out.println("Books:   "+ Swiss.getBooks());
		Swiss.addFolders();
		System.out.println("Folders: "+Swiss.getFolders());
		Swiss.removeFolders();
		System.out.println("Folders: "+Swiss.getFolders());
		Swiss.addPencils();
		System.out.println("Pencils: " +Swiss.getPencils());
		Swiss.removePencils();
		System.out.println("Pencils: "+Swiss.getPencils());
		Swiss.openBackpack();
		System.out.println(Jansport);
		System.out.println(Swiss);
	}
}




