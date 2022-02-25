
public class TvTester {
	public static void main(String[] args) {
		Tv samsung = new Tv();
		Tv toshibi = new Tv("hwdfjl1212",true,55,2,1);
		samsung.turnOn();
		System.out.println("Power: "+ samsung.getPower());
		samsung.changeVolumeUp();
		System.out.println("Volume: "+ samsung.getVolume());
		samsung.changeVolumeDown();
		System.out.println("Volume: " + samsung.getVolume());
		samsung.changeChannelDown();
		System.out.println("Channel: "+ samsung.getChannel());
		samsung.changeChannelUp();
		System.out.println("Channel: "+samsung.getChannel());
		samsung.changeInputUp();
		System.out.println("Input: "+samsung.getInput());
		samsung.changeInputDown();
		System.out.println("Input: "+samsung.getInput());
		samsung.turnOff();
		System.out.println("Power: "+ samsung.getPower());
		samsung.changeChannelUp();
		System.out.println("Channel: "+samsung.getChannel());
		samsung.changeChannelDown();
		System.out.println("Channel: "+samsung.getChannel());
		samsung.changeVolumeUp();
		System.out.println("Volume: " + samsung.getVolume());
		samsung.changeVolumeDown();
		System.out.println("Volume: " + samsung.getVolume());
		toshibi.turnOff();
		System.out.println("Power: "+ toshibi.getPower());
		toshibi.changeChannelUp();
		System.out.println("Channel: "+toshibi.getChannel());
		toshibi.changeChannelDown();
		System.out.println("Channel: "+toshibi.getChannel());
		toshibi.changeVolumeDown();
		System.out.println("Volume: " + toshibi.getVolume());
		toshibi.changeVolumeUp();
		System.out.println("Volume: " + toshibi.getVolume());
		toshibi.turnOn();
		System.out.println("Power: "+ toshibi.getPower());
		toshibi.changeVolumeUp();
		System.out.println("Volume: " + toshibi.getVolume());
		toshibi.changeVolumeDown();
		System.out.println("Volume: " + toshibi.getVolume());
		toshibi.changeChannelUp();
		System.out.println("Channel: "+toshibi.getChannel());
		toshibi.changeChannelUp();
		System.out.println("Channel: "+toshibi.getChannel());
		toshibi.changeChannelDown();
		System.out.println("Channel: "+toshibi.getChannel());
		toshibi.changeInputUp();
		System.out.println("Input: " +toshibi.getInput());
		toshibi.changeInputDown();
		System.out.println("Input: " +toshibi.getInput());
		System.out.println(samsung);
		System.out.println(toshibi);
	}

}
