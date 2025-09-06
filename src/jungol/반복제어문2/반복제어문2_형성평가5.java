package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        System.out.printf("even : %d\n", a);
        System.out.printf("odd : %d", b);
    }
}
