package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[6];
        double sum = 0d;

        for (int i = 0; i < 6; i++) {
            double a = sc.nextDouble();
            arr[i] = a;
            sum += a;
        }
        System.out.printf("%.1f", (double) sum / arr.length);
    }
}
