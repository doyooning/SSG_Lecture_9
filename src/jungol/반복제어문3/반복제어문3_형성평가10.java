package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1; // 초기값 설정 1로 함

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d ", count % 10);
                // 10으로 나눈 나머지를 계속 활용 -> 1, 3, 5, 7, 9
                count += 2; // 출력 1번 하고 2씩 추가
            }
            System.out.println();
        }
    }
}
