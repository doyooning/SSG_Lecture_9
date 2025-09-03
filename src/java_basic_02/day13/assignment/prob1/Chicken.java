package java_basic_02.day13.assignment.prob1;

public class Chicken extends Animal implements Cheatable {

    public Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance += speed * hours;
    }

    @Override
    public void fly() {
        this.speed = 2 * speed;
    }
}
