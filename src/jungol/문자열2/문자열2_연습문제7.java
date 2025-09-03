package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"champion", "tel", "pencil",
                "jungol", "olympiad", "class",
                "information", "lesson", "book", "lion"};
        boolean statusA = false;
        boolean statusB = false;

        System.out.print("문자를 입력하세요. ");
        String a = sc.next();

        for (String s : str) {
            if (s.contains(a)) {
                System.out.println(s);
                statusA = true;
            }
        }
        if (!statusA) {
            System.out.println("찾는 단어가 없습니다.");
        }
        System.out.println();
        System.out.print("문자열을 입력하세요. ");
        String b = sc.next();

        for (String s : str) {
            if (s.contains(b)) {
                System.out.println(s);
                statusA = true;
            }
        }
        if (!statusA) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}
