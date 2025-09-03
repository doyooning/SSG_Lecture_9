package java_basic_02.day13.interfaceEx;

public class User {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setTimer(10);
        rc.setVolume(20);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();
        RemoteControl.chargeBattery();
    }
}
