package lab14.bridge.pseudocode;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if (device.isEnabled()){
            device.disable();
        }
        else {
            device.enable();
        }
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 10);
    }
    public void volumeUp(){
        device.setVolume(device.getVolume() + 10);
    }
    public void channelDown(){
        device.setVolume(device.getChannel() - 1);
    }
    public void channelUp(){
        device.setVolume(device.getChannel() + 1);
    }

}
