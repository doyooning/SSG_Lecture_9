package java_advanced_01.day15.prob1;

public class CellPhone extends Exception {
    private String model;
    private double battery;

    public CellPhone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public void call(int time) throws IllegalArgumentException {
        if (time < 0) {
            throw new IllegalArgumentException("통화시간입력오류");
        }

        System.out.printf("통화 시간 : %d분\n", time);

        if ((getBattery() - time * 0.5) < 0) {
            setBattery(0);
        } else {
            setBattery(getBattery() - time * 0.5);
        }
    }

    public void charge(int time) throws IllegalArgumentException {
        if (time < 0) {
            throw new IllegalArgumentException("충전시간입력오류");
        }

        System.out.printf("충전 시간 : %d분\n", time);

        if ((getBattery() + time * 3) > 100) {
            setBattery(100);
        } else {
            setBattery(getBattery() + time * 3);
        }

    }

    public void printBattery() {
        System.out.printf("남은 배터리 양 : %.1f\n", getBattery());
    }
}
