package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int a = sc.nextInt();

            if (a == 0) {
                break;
            }
            sum += a;
            count++;
        }
        double avg = (double) sum / count;
        System.out.printf("입력된 자료의 개수 = %d\n", count);
        System.out.printf("입력된 자료의 합계 = %d\n", sum);
        System.out.printf("입력된 자료의 평균 = %.2f", avg);
    }
}
