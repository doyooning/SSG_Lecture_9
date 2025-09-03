package java_basic_02.day12.test250807.test6;

public class Bike extends Wheeler {
    public Bike(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed;
        if (velocity > 40) {
            velocity = 40;
        }
        System.out.printf("%s의 현재 속도는 %d 입니다.\n", carName, velocity);
    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed;
        if (velocity < 10) {
            velocity = 10;
        }
        System.out.printf("%s의 최저속도위반으로 속도를 %d 으로 올립니다.\n", carName, velocity);
    }
}
