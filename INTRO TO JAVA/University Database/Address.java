package hw06;
/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: This program allows the user to fill a database that computes multiple different types of the Person class.
 * The program then computes and saves the data in an arraylistPerson.
 */
public class Address {
	private int streetNum;
	private int apartmentNum;
	private String streetName;
	private String cityName;
	private String stateName;
	private String zipCode;

	public Address(int streetNum, int apartmentNum, String streetName, 
			String cityName, String stateName, String zipCode) {
		this.streetNum=streetNum;
		this.apartmentNum=apartmentNum;
		this.streetName=streetName;
		this.cityName=cityName;
		this.stateName=stateName;
		this.zipCode=zipCode;
	}
	public Address(int streetNum, String streetName, String cityName,
			String stateName, String zipCode) {
		this.apartmentNum =0;
		this.streetNum=streetNum;
		this.streetName=streetName;
		this.cityName=cityName;
		this.stateName=stateName;
		this.zipCode=zipCode;
	}
	public int getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	public int getApartmentNum() {
		return apartmentNum;
	}
	public void setApartmentNum(int apartmentNum) {
		this.apartmentNum = apartmentNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Address)) {
			return false;
		}
		Address temp= (Address)other;
		boolean isStreetNum = this.streetNum == temp.streetNum;
		boolean isStreetName= this.streetName == temp.streetName;
		boolean isApartmentNum = this.apartmentNum == temp.apartmentNum;
		boolean isCityName= this.cityName == temp.cityName;
		boolean isStateName=this.stateName == temp.stateName;
		boolean isZipCode = this.zipCode == temp.zipCode;

		return isStreetNum && isStreetName && isCityName && isStateName && isZipCode && isApartmentNum;
	}

	@Override
	public String toString() {
		String output="";
		output+="Address:\t"+streetNum+" "+streetName+" "+"#"+apartmentNum+"\n";
		output+="\t\t"+cityName+", "+stateName+", "+zipCode;
		return output;
	}

}
