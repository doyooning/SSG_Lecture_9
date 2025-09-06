package java_basic_02.day12.test250807.test6;

public class Truck extends Wheeler {
    public Truck(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed * 5;
        if (velocity > 100) {
            velocity = 100;
        }
        System.out.printf("%s의 현재 속도는 %d 입니다.\n", carName, velocity);
    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed * 5;
        if (velocity < 50) {
            velocity = 50;
        }
        System.out.printf("%s의 최저속도위반으로 속도를 %d으로 올립니다.\n", carName, velocity);
    }
}
