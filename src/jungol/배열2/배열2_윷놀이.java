package jungol.배열2;

import java.util.Scanner;

public class 배열2_윷놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] N = new int[3][5];

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int a = sc.nextInt();
                N[i][j] = a;
                sum += a;
            }
            N[i][4] = sum;
        }

        // 출력
        for (int i = 0; i < 3; i++) {
            switch (N[i][4]) {
                case 0:
                    System.out.println("D");
                    break;

                case 1:
                    System.out.println("C");
                    break;

                case 2:
                    System.out.println("B");
                    break;

                case 3:
                    System.out.println("A");
                    break;

                case 4:
                    System.out.println("E");
                    break;

            }
        }
    }
}
