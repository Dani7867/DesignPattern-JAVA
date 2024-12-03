package structural.bridge;

public class BasicRemote extends Remote {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeUp() {
        int volume = device.getVolume();
        device.setVolume(volume + 1);
    }

    @Override
    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(volume - 1);
    }

    @Override
    public void channelUp() {
        int channel = device.getChannel();
        device.setChannel(channel + 1);
    }

    @Override
    public void channelDown() {
        int channel = device.getChannel();
        device.setChannel(channel - 1);
    }
}

