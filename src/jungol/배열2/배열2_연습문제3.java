package jungol.배열2;

public class 배열2_연습문제3 {
    public static void main(String[] args) {
        int[] N = new int[40];

        for (int i = 0; i < 40; i++) {
            if (i <= 1) {
                N[i] = 1;
            } else {
                N[i] = N[i - 2] + N[i - 1];
            }
        }
        System.out.printf("피보나치 수열 10항 : %d\n", N[9]);
        System.out.printf("피보나치 수열 20항 : %d\n", N[19]);
        System.out.printf("피보나치 수열 30항 : %d\n", N[29]);
        System.out.printf("피보나치 수열 40항 : %d\n", N[39]);
    }
}
