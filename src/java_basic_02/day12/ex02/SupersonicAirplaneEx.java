package java_basic_02.day12.ex02;

public class SupersonicAirplaneEx {
    public static void main(String[] args) {
        SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
        supersonicAirplane.takeOff();
        supersonicAirplane.fly();
        supersonicAirplane.setFlyMode(SupersonicAirplane.SUPERSONIC);
        supersonicAirplane.fly();
        supersonicAirplane.takeOff();
    }
}
