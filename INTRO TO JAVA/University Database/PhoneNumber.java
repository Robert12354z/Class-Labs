package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
public class PhoneNumber {
	private String type;
	private int areaCode;
	private int prefix;
	private int sufix;

	public PhoneNumber(String type, int areaCode, int prefix, int sufix) {
		this.type=type;
		this.areaCode=areaCode;
		this.prefix=prefix;
		this.sufix=sufix;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public int getPrefix() {
		return prefix;
	}

	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}

	public int getSufix() {
		return sufix;
	}

	public void setSufix(int sufix) {
		this.sufix = sufix;
	}
	@Override
	public boolean equals(Object stuff) {
		if(!(stuff instanceof PhoneNumber)) {
			return false;
		}

		PhoneNumber temp = (PhoneNumber)stuff;

		boolean isType = this.type== temp.type;
		boolean isAreaCode = this.areaCode == temp.areaCode;
		boolean isPrefix = this.prefix == temp.prefix;
		boolean isSufix= this.sufix == temp.sufix;

		return isType && isAreaCode && isPrefix && isSufix;
	}

	@Override
	public String toString() {
		String output="";
		output+=type+": "+"("+areaCode+")"+" "+prefix+"-"+sufix;
		return output;
	}

}
