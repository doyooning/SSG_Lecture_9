package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (true) {
            count++;
            if ((n * count) > 100) { // n * count 출력을 하기 전에 판단
                break;
            }
            System.out.printf("%d ", n*count);
            if ((n * count) % 10 == 0) { // n * count 계산 및 출력 후 판단
                break;
            }
        }
    }
}
