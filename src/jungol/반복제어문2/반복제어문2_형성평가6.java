package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f", avg);
    }
}
