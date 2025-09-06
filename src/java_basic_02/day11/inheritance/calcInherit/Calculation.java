package java_basic_02.day11.inheritance.calcInherit;

public class Calculation {
    private final int a = 20;
    private final int b = 10;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void addition() {
        System.out.println("두 수의 덧셈 : " + (a + b));
    }

    public void subtraction() {
        System.out.println("두 수의 뺄셈 : " + (a - b));
    }
}
