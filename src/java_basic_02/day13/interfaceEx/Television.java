package java_basic_02.day13.interfaceEx;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("현재 볼륨 : " + this.volume);
    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("muted");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("muted off");
            setVolume(this.memoryVolume);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("TV On");
    }

    @Override
    public void setTimer(int time) {
        System.out.printf("TV %d분\n", time);
    }

    @Override
    public void turnOff() {
        System.out.println("TV Off");
    }
}
