package jungol.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int maxIndex = 9;
        int minIndex = 0;

        int maxEven = arr[maxIndex];
        int minOdd = arr[minIndex];

        while (Math.abs(maxEven) % 2 != 0) {
            maxIndex--;
            maxEven = arr[maxIndex];
        }

        while (Math.abs(maxEven) % 2 != 1) {
            minIndex--;
            minOdd = arr[minIndex];
        }

        System.out.printf("%d %d", minOdd, maxEven);
    }
}
