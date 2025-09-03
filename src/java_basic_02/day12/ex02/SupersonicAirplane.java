package java_basic_02.day12.ex02;

public class SupersonicAirplane extends Airplane {
    //상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    //상태 필드 선언
    public int flyMode = NORMAL;

    public int getFlyMode() {
        return flyMode;
    }

    public void setFlyMode(int flyMode) {
        this.flyMode = flyMode;
    }

    //메소드 재정의
    @Override
    public void fly() {
        if (flyMode == NORMAL) {
            super.fly();
        } else {
            System.out.println("음속 비행합니다.");
        }
    }
}
