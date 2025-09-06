package java_advanced_01.day18.cls1;

public class CalcMain {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;

        Calculator calculator = new Calculator(number1, number2);

        int result1 = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });
        System.out.println(result1);

        int result2 = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        });
        System.out.println(result2);
    }
}
