package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] S = str.split(" ");

        for (int i = S.length-1; i >= 0; i--) {
            System.out.println(S[i]);
        }
    }
}
