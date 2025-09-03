package java_basic_02.shinsegaeTraining.test.loop_array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaBasic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentAmount = 0;
        int scoreMax = 0;
        int scoreSum = 0;
        int[] scores = null;

        Contents:
        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");
            try {
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("학생수> ");
                        studentAmount = sc.nextInt();
                        scores = new int[studentAmount];
                        break;
                    case 2:
                        for (int i = 0; i < studentAmount; i++) {
                            System.out.printf("scores[%d]> ", i);
                            int scoreInput = sc.nextInt();
                            scores[i] = scoreInput;
                            scoreSum += scoreInput;
                            scoreMax = Math.max(scoreMax, scoreInput);
                        }
                        break;
                    case 3:
                        for (int i = 0; i < studentAmount; i++) {
                            System.out.printf("scores[%d]: %d\n", i, scores[i]);
                        }
                        break;
                    case 4:
                        System.out.printf("최고 점수: %d\n", scoreMax);
                        System.out.printf("평균 점수: %.1f\n", (double) scoreSum / studentAmount);
                        break;
                    case 5:
                        break Contents;
                    default:
                        System.out.println("유효한 숫자를 입력해주십시오.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주십시오.");
                sc.nextLine();
            }
        }
    }
}
