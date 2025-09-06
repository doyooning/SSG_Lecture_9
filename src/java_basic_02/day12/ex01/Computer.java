package java_basic_02.day12.ex01;

public class Computer extends Calculator {

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        super.areaCircle(r);
        return Math.PI * r * r;
    }
}
