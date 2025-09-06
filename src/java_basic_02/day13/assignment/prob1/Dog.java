package java_basic_02.day13.assignment.prob1;

public class Dog extends Animal {

    public Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        this.distance += speed * hours / 2;
    }
}
