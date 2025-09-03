package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = {"flower", "rose", "lily", "daffodil", "azalea"};
        int count = 0;
        char c = sc.next().charAt(0);

        for (String s : S) {
            if ((s.charAt(1) == c) || (s.charAt(2) == c)) {
                System.out.println(s);
                count++;
            }
        }
        System.out.println(count);
    }
}
