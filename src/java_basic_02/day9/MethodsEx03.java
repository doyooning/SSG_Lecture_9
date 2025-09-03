package java_basic_02.day9;

public class MethodsEx03 {
    public static void main(String[] args) {
        int result = div();
        System.out.println(result);
    }

    public static int div() {
        int n1 = 10, n2 = 5, result = 0;
        if (n2 != 0) {
            result = n1 / n2;
        } else {
            System.out.println("0으로 못 나눔");
        }
        return result;
    }
}
