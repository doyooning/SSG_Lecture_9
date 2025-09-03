package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] N = new char[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                char a = sc.next().charAt(0);
                N[i][j] = (char)(a + 32);
            }
        }

        //출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// A = 65, a = 91