package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf("입력받은 문자열의 길이는 %d입니다. \n", str.length());
        char[] C = str.toCharArray();
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(C[i]);
        }
    }
}
