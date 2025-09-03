package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        for (String a : s) {
            System.out.println(a);
        }
    }
}
