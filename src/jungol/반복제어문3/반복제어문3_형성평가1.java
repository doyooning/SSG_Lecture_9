package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 20; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
            count++;
        }
        System.out.printf("%d %d", sum, (int)(sum / count));
    }
}
