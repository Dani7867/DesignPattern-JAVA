package structural.bridge;

public class Tv implements Device{
	
	    boolean isEnabled=false;
	    int volume=5;
	    int channel=100;
	@Override
	public boolean isEnabled() {
		return isEnabled;
	}

	@Override
	public void enable() {
		isEnabled = true;
		
	}

	@Override
	public void disable() {
		isEnabled = false;
		
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		
	}

	@Override
	public int getChannel() {
		return channel;
	}
	
	
}
