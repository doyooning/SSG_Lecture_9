package jungol.배열2;

public class 배열2_연습문제7 {
    public static void main(String[] args) {
        int[][] N = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                if (j == 0) {
                    N[i][j] = 1;
                } else {
                    N[i][j] = N[i-1][j-1] + N[i-1][j];
                }
            }
        }

        //출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (N[i][j] != 0) {
                    System.out.print(N[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
