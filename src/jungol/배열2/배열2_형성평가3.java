package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            switch(i) {
                case 0:
                    N[i] = a;
                    break;
                case 1:
                    N[i] = b;
                    break;
                default:
                    N[i] = (N[i - 2] + N[i - 1]) % 10;
            }
        }

        //출력
        for (int i = 0; i < 10; i++) {
            System.out.print(N[i] + " ");
        }
    }
}
