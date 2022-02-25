
public class Tv {
	private boolean Power;
	private String tvID;
	private int Channel;
	private int Volume;
	private int Input;

	public Tv() {
		this.tvID="aaa9999";
		this.Channel=1;
		this.Volume=1;
		this.Input=1;
	}
	public Tv(String tvID, boolean Power, int Channel, int Volume, int Input) {
		this.setTvID(tvID);
		this.setPower(Power); 
		this.setChannel(Channel);
		this.setVolume(Volume);
		this.setInput(Input);
	}
	public String gettvID() {
		return this.tvID;
	}
	public int getChannel() {
		return this.Channel;
	}
	public int getVolume() {
		return this.Volume;
	}
	public int getInput() {
		return this.Input;
	}
	public boolean getPower() {
		return this.Power;
	}
	public void setPower(boolean Power) {
		this.Power=Power;
	}
	public void setTvID(String tvID) {
		this.tvID=tvID; 
	}
	public void setChannel(int Channel) {
		if(Channel < 1|| Channel>100) {
			System.out.println("This is not a valid TV Channel.");
		}
		else {
			this.Channel=Channel;
		} 

	}
	public void setVolume(int Volume) {
		if(Volume<0|| Volume>10) {
			System.out.println("This is not a valid Volume.");
		}
		else {
			this.Volume=Volume;
		}
	}
	public void setInput(int Input) {
		if(Input<0||Input>3) {
			System.out.println("This is not a valid Input");
		}
		else {
			this.Input=Input;
		}
	}
	public void changeChannelUp() {
		if(this.Power==false) { 
			System.out.println("ERROR: Tv is turned off");
		}
		else {
			Channel = this.Channel+1;
		}
	}
	public void changeChannelDown() {
		if(this.Power==false) { 
			System.out.println("ERROR: Tv is turned off");
		}
		else {
			Channel = this.Channel-1;
		}
	}
	public void changeVolumeUp() {
		if(this.Power==false) { 
			System.out.println("ERROR: Tv is turned off");
		}
		else {
			Volume = this.Volume+1;
		}
	}
	public void changeVolumeDown() {
		if(this.Power==false) { 
			System.out.println("ERROR: Tv is turned off");
		}
		else {
			Volume = this.Volume-1;
		}
	}

	public void changeInputUp() {
		if(this.Power == false) {
			System.out.println("ERROR: Tv is turned off");
		}
		else {
			Input= this.Input+1;
		}
	}
	public void changeInputDown() {
		if(this.Power == false) {
			System.out.println("ERROR: Tv is turned off");
		}
		else {
			Input= this.Input-1;
		}
	}

	public void turnOn() {
		this.Power=true;
	}
	public void turnOff() {
		this.Power= false;
	}
	public String toString() {
		String output="";
		output += "_________________________\n";
		output += "tvID:\t" + this.tvID + "\n";
		output += "Power:\t" + this.Power + "\n";
		output += "Volume:\t" + this.Volume + "\n";
		output += "Channel:"  + this.Channel +"\n";
		output += "Input:\t"+this.Input+"\n";
		return output;
	}

}

