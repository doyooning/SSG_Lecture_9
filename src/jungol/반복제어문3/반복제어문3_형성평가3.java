package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i++) { // n = 3일 때 5행 -> (2*n-1)행
            if (i <= n) { // i = n까지만 오름차순으로 별찍기
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else { // i = n+1부터는 내림차순으로 별찍기
                for (int j = 2*n-1; j >= i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
