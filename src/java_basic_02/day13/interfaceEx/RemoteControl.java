package java_basic_02.day13.interfaceEx;

public interface RemoteControl {
    int MAX_VOLUME = 30;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();

    void setTimer(int time);

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리 작동");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
        }
    }

    static void chargeBattery() {
        System.out.println("리모컨 배터리 교체좀");
        //정적 필드 접근 가능
        System.out.println(RemoteControl.MAX_VOLUME);
        //인스턴스, 디폴트, private 메서드 호출 불가
        //= static 써준 것들만 가능
    }
}
