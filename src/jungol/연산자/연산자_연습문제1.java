package 연산자;

import java.util.Scanner;

public class 연산자_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 수를 입력하시오. ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        System.out.printf("%d %% %d = %d", a, b, a%b);
    }
}
