package structural.bridge;

public abstract class Remote {
	protected Device device ;
	
	public Remote(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void volumeUp();
    public abstract void volumeDown();
    public abstract void channelUp();
    public abstract void channelDown();
}
