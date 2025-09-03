package 연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a += 5;
        b = 2 * b;

        System.out.printf("width = %d\n", a);
        System.out.printf("length = %d\n", b);
        System.out.printf("area = %d", a*b);
    }
}
