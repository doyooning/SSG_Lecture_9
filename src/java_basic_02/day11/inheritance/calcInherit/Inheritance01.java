package java_basic_02.day11.inheritance.calcInherit;

public class Inheritance01 extends Calculation {

    public void multiplication() {
        System.out.println("두 수의 곱셈 : " + (getA() * getB()));
    }

    public static void main(String[] args) {
        Inheritance01 obj = new Inheritance01();

        obj.addition();
        obj.subtraction();
        obj.multiplication();
    }
}
