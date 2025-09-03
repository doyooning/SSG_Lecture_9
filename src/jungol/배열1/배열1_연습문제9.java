package jungol.배열1;

import java.util.Arrays;

public class 배열1_연습문제9 {
    public static void main(String[] args) {
        int[] N = new int[] {95, 75, 85, 100, 50};

        Arrays.sort(N);

        for (int i : N) {
            System.out.print(i + " ");
        }
    }
}
