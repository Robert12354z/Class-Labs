/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 */
package hw07;
import interfaces.Calculable;

public class Money implements Comparable<Money>, Calculable<Money>  {
	private int dollars=0;
	private int cents=0;

	public Money() {
		this.dollars=0;
		this.cents=0;
	}
	public Money(int dollars, int cents) {
		this.dollars=dollars;
		this.cents=cents;
	}
	public Money(double total) {
		this.dollars=(int)total;
		double temp = (total*100);
		this.cents=(int)temp-(this.dollars*100);
	}
	public int getDollars() {
		return dollars;
	}
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}
	public int getCents() {
		return cents;
	}
	public void setCents(int cents) {
		if(cents>=100||cents<0) {
			System.out.println("ERROR: cents can only be number between 99 and 0");
		}
		else {
			this.cents = cents;
		}
	}
	@Override
	public Money add(Money temp) {
		int dollars= this.dollars+temp.dollars;
		int cents=this.cents+temp.cents;
		if(cents>=100) {
			int newCents=cents-100;
			dollars++;
			Money quick = new Money(dollars,newCents);
			return quick;
		}else {
			Money quick= new Money(dollars,cents);
			return quick;
		}
	}
	@Override
	public Money subtract(Money temp) {
		double origTotal= (double)this.dollars*1.00+(this.cents/100.00);
		double tempTotal= (double)temp.dollars*1.00+(temp.cents/100.00);
		double finTotal= (origTotal-tempTotal)/1.00;

		Money quick =new Money(finTotal);
		return quick;
	}
	@Override
	public int compareTo(Money temp) {
		int dif = this.dollars-temp.dollars;
		if (dif <0) {
			return -1;
		}
		else if(dif ==0) {
			int difCents= this.cents-temp.cents;
			if(difCents<0) {
				return -1;
			}
			else if (difCents == 0) {
				return 0;
			}
			else {
				return 1;
			}
		}
		else {
			return 1;
		}

	}
	@Override
	public String toString() {
		String output="";
		output+= "$"+this.dollars;
		output+="."+this.cents;
		return output;
	}
}

