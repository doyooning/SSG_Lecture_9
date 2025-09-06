package 연산자;

import java.util.Scanner;

public class 연산자_연습문제2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5개의 수를 입력하시오. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.printf("%d %d %d %d %d", a+3, b-3, c*3, d/3, e%3);

    }
}
