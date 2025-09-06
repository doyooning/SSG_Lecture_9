package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연산문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int a = sc.nextInt();

        if ((a >= 90) && (a <= 100)) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else if ((a <= 50) && (a >= 0)) {
            System.out.println("F");
        } else {
            System.out.println("0~100 사이의 점수를 입력하여 주십시오.");
        }
    }
}
