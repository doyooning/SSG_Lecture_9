package jungol.문자열1;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class 문자열1_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char a = sc.next().charAt(0);
            if ((a >= 123) || (a <= 47)) {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
            if (isDigit(a)) {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println(isUpperCase(a) ? "대문자입니다." : "소문자입니다.");
            }
        }
    }
}
// a = 97 A = 65 //// ~ 64  123 ~
// 숫자 = 48 ~ 57