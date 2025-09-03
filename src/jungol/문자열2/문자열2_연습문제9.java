package jungol.문자열2;

import java.util.Scanner;

// 미완
public class 문자열2_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = 20;
        int[] N = new int[5]; // 합 배열
        String[] str = new String[5];

        System.out.println("단어 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            String a = sc.next();
            str[i] = a;
            l = Math.min(l, a.length());
        }

        for (int i = 0; i < l; i++) {
            int sum = 0;
            char[] C = str[i].toCharArray();
            sum += C[i];
            N[i] = sum;
        }

        //출력
    }
}
