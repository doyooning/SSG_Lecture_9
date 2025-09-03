package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] S = str.split(" ");
        for (String a : S) {
            System.out.println(a);
        }
    }
}
