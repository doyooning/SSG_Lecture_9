package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i++) {
            // 행 : 1부터 2*n-1까지
            if (i <= n) { // 내림차순 별찍기랑 오름차순 별찍기로 반 나눔
                for (int j = 1; j <= i-1; j++) { // 앞에 넣을 공백
                    // 공백은 i-1개만큼 늘어나면 되고
                    // j = 1(시작)일때 공백 안찍어야 됨
                    System.out.print(" ");
                }
                for (int j = 2*n-1; j >= 2*i-1; j--) { // 별 찍기
                    // 별은 처음에 2*n-1개로 시작해서 1까지 줄어들어야 함
                    // n = 3일 때 i = 1이면 5개 찍고, i = 2이면 3개 찍고, ...
                    System.out.print("*");
                }
            } else {
                for (int j = 2*n-1-i; j >= 1; j--) { // 앞에 넣을 공백
                    //
                    System.out.print(" ");
                }
                for (int j = 2*n-1; j <= 2*i-1; j++) { // 별 찍기
                    // 위와 동일 방식, 오름차순
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
