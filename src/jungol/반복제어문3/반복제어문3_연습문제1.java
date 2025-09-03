package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int count = 0;

        while (true) {
            count++;
            sum += count;
            if (sum > a) {
                break;
            }
        }
        System.out.print(count +" "+ sum);
    }
}
