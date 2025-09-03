package java_basic_02.day9;

import java.util.Scanner;

public class MethodsEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나누기 결과를 위한 숫자 두 개 입력");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = div(n1, n2);
        System.out.printf("요청하신 %d / %d의 나누기 결과는 %d", n1, n2, result);
    }

    public static int div(int num1, int num2) {
        int n1 = num1, n2 = num2, result = 0;
        if (n2 != 0) {
            result = n1 / n2;
        } else {
            System.out.println("0으로 나누기 금지");
        }
        return result;
    }
}
