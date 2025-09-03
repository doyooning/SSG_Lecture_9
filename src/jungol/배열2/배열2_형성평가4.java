package jungol.배열2;

public class 배열2_형성평가4 {
    public static void main(String[] args) {
        int[][] N = new int[][] {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(N[i][j] + " ");
                sum += N[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
