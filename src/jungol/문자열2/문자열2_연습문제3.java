package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"champion", "class" };
        int count = 0;
        System.out.print("문자를 입력하세요. ");
        char a = sc.next().charAt(0);

        for (String s : str) {
            if (a == s.charAt(0)) {
                System.out.println(s);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}
