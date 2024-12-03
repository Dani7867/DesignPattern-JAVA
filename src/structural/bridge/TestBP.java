package structural.bridge;

public class TestBP {
	public static void main(String[] args) {
		
		Device tv = new Tv();
		Remote basicRemote = new BasicRemote(tv);
	
		basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.channelUp();

        System.out.println("TV is " + (tv.isEnabled() ? "On" : "Off"));
        System.out.println("TV Volume: " + tv.getVolume());
        System.out.println("TV Channel: " + tv.getChannel());
        
        Device radio = new Radio();
		AdvancedRemote advancedRemote = new AdvancedRemote(radio);
		
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        advancedRemote.channelUp();

        System.out.println("Radio is " + (radio.isEnabled() ? "On" : "Off"));
        System.out.println("Radio Volume: " + radio.getVolume());
        System.out.println("Radio Channel: " + radio.getChannel());
		
	}
}
