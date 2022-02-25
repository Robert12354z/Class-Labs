/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 */
package hw07;
import interfaces.Calculable;

public class Time implements Comparable<Time>, Calculable<Time>{

	private int hours=0;
	private int	minutes=0;
	private int seconds=0;

	public Time() {
		this.hours=0;
		this.minutes=0;
		this.seconds=0;
	}
	public Time(int hours, int minutes, int seconds) {
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if(minutes>=60|| minutes<=-60) {
			System.out.println("ERROR: Minutes must be from 59 to -59");
		}else {

			this.minutes = minutes;
		}
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		if(seconds>=60|| seconds<=-60) {
			System.out.println("ERROR: Seconds must be from 59 to -59");
		}else {

			this.seconds = seconds;
		}
	}
	@Override
	public Time add(Time temp) {
		int hours= this.hours+temp.hours;
		int minutes=this.minutes+temp.minutes;
		int seconds=this.seconds+temp.seconds;
		if(seconds>59) {
			seconds=seconds-60;
			minutes++;
		}
		if(minutes>59) {
			minutes= minutes-60;
			hours++;
		}
		

		Time finalTime = new Time(hours,minutes,seconds);	
		return finalTime;
	}

	@Override
	public Time subtract(Time temp) {
		int negative =-1;
		int hours= this.hours-temp.hours;
		int minutes=this.minutes-temp.minutes;
		int seconds=this.seconds-temp.seconds;
		
		if(seconds<-59) {
			seconds=seconds+60;
			minutes--;
		}
		if(minutes<-59) {
			minutes= minutes+60;
			hours--;
		}

		Time finalTime = new Time(hours,minutes,seconds);	
		return finalTime;
	}

	@Override
	public int compareTo(Time temp) {
		int difHour = this.hours-temp.hours;
		if (difHour <0) {
			return 1;
		}
		else if(difHour ==0) {
			int difMinutes= this.minutes-temp.minutes;
			if(difMinutes<0) {
				return 1;
			}
			else if (difMinutes == 0) {
				int difSeconds = this.seconds-temp.seconds;
				if(difSeconds<0) {
					return 1;
			}
				else if(difSeconds==0) {
					return 0;
				}
				else {
					return -1;
				}
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	
}
@Override
public String toString() {
	String output="";
	output+=this.hours+":";
	output+=this.minutes+":";
	output+=this.seconds;
	return output;
}

}
