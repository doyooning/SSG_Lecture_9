package jungol.배열2;

public class 배열2_형성평가6 {
    public static void main(String[] args) {
        int[][] N = new int[5][5];
        N[0][0] = 1;
        N[0][2] = 1;
        N[0][4] = 1;

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                switch(j) {
                    case 0:
                        N[i][j] = N[i - 1][j + 1];
                        break;
                    case 4:
                        N[i][j] = N[i - 1][j - 1];
                        break;
                    default:
                        N[i][j] = N[i - 1][j - 1] + N[i - 1][j + 1];
                        break;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println();
        }
    }
}
