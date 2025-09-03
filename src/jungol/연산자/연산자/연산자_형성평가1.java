package 연산자;

import java.util.Scanner;

public class 연산자_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = a+b+c+d;

        System.out.printf("sum %d\n", sum);
        System.out.printf("avg %.0f", Math.floor((double) (sum / 4)));

    }
}
