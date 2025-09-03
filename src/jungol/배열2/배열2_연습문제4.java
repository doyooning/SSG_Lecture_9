package jungol.배열2;

public class 배열2_연습문제4 {
    public static void main(String[] args) {
        int[][] N = new int[3][3];
        N[0] = new int[]{3, 5, 4};
        N[1] = new int[]{2, 6, 7};
        N[2] = new int[]{8, 10, 1};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println();
        }
    }
}
