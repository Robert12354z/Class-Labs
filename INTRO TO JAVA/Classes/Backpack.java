
public class Backpack {
	private String Brand;
	private boolean Zipper;
	private double Books;
	private double Folders;
	private double Pencils;


	public Backpack() {
		this.Books=1;
		this.Folders=1;
		this.Brand="aaa9999";
		this.Pencils=1;
		this.Zipper=false;


	}
	public Backpack(String Brand,boolean Zipper, int Books, int Folders, int Pencils) {
		this.Zipper=Zipper;
		this.Books=Books;
		this.Folders=Folders;
		this.Brand=Brand;
		this.Pencils=Pencils;
	}
	public String getBrand() {
		return Brand;
	}
	public double getBooks() {
		return Books;
	}
	public double getFolders() {
		return Folders;
	}
	public double getPencils() {
		return Pencils;
	}
	public boolean getZipper() {
		return Zipper;
	}
	public void setBrand(String Brand) {
		this.Brand=Brand;
	}
	public void setZipper(boolean Zipper) {
		this.Zipper=Zipper;
	}
	public void setBooks(double Books) {
		this.Books=Books;
		if(Books<0) {
			System.out.println("ERROR: There can be either zero amount or a number greater than 0");
		}
	}
	public void setFolders(double Folders) {
		this.Folders=Folders;
		if(Books<0) {
			System.out.println("ERROR: There can be either zero amount or a number greater than 0");
		}
	}
	public void setPencils(double Pencils) {
		this.Pencils=Pencils;
		if(Pencils<0) {
			System.out.println("ERROR: There can be either zero amount or a number greater than 0");
		}
	}
	public void removeBooks() {
		if(Zipper==false) { 
			System.out.println("The backpack is closed");
		}else {
			Books=this.Books-1;
		}
	}
	public void addBooks() {
		if(Zipper==false) { 
			System.out.println("The backpack is closed");
		}else {
			Books=this.Books+1;
		}
	}
	public void removeFolders() {
		if(Zipper==false) { 
			System.out.println("The backpack is closed");
		}else {
			Folders=this.Folders-1;
		}
	}
	public void addFolders() {
		if(Zipper==false) { 
			System.out.println("The backpack is closed");
		}
		else {
			Folders=this.Folders+1;
		}
	}
	public void removePencils() {
		if(Zipper==false) { 
			System.out.println("The backpack is closed");
		}else {
			Pencils=this.Pencils-1;
		}
	}
	public void addPencils() {
		if(Zipper==false) {
			System.out.println("The backpack is closed");
		}
		else {
			Pencils=this.Pencils+1;
		}
	}
	public void closeBackpack() {
		this.Zipper=false;
	}
	public void openBackpack() {
		this.Zipper=true;
	}
	public double Total() {
		double Total= (this.Folders+this.Books+this.Pencils);
		return Total;
	}
	public double Weight() {
		double Weight = (Folders*0.5/*lbs*/+Pencils*0.3/*lbs*/+Books*2/*lbs*/);
		return Weight;
	}
	public String toString() {
		String output="";
		output += "_________________________\n";
		output += "Brand:\t\t" + this.Brand + "\n";
		output += "Zipper:\t\t"+ this.Zipper + "\n";
		output += "Books:\t\t" + this.Books + "\n";
		output += "Folders:\t" + this.Folders + "\n";
		output += "Pencils:\t"  + this.Pencils +"\n";
		output += "Total:\t\t"+ this.Total()+"\n";
		output += "Weight:\t\t"+ this.Weight()+" lbs";
		return output;
	}
}
