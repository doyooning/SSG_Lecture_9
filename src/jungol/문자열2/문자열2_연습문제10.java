package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[2];
        int[] Nn = new int[2];
        double[] D = new double[2];
        String[] S = new String[4];

        // 문자열 뒤집고
        // toCharArray 작업 한 다음에
        // 하나씩 -48 하고
        // for문 돌려서 10^n만큼 곱하고 더하기(자릿수 보정)
        // 값을 저장 N[]

        for (int i = 0; i < 2 ; i++) {
            int sum = 0;
            String strInt = sc.next();
            StringBuffer sb1 = new StringBuffer(strInt);
            sb1.reverse();
            char[] C = sb1.toString().toCharArray();
            for (int j = 0; j < sb1.length(); j++) {
                int a = (C[j] - 48) * (int)Math.pow(10, j);
                sum += a;
            }
            N[i] = sum;
        }

        /*
        * 소수 -> 포인트 기준으로 문자열 나눠
        * 정수 부분은 위처럼 작업
        * 소수 부분은 reverse 안하고
        *
        * */

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            String strDbl = sc.next();
            S = strDbl.split("\\.");

            //정수부분
            StringBuffer sb2 = new StringBuffer(S[0]);
            sb2.reverse();
            char[] C = sb2.toString().toCharArray();
            for (int j = 0; j < S[0].length(); j++) {
                int a = (C[j] - 48) * (int)Math.pow(10, j);
                sum += a;
            }
            Nn[i] = sum;

            //소수부분
            double sumDbl = 0d;
            char[] ch = S[1].toCharArray();
            for (int j = 0; j < S[1].length(); j++) {
                double a = (ch[j] - 48) * Math.pow(10, -(j+1));
                sumDbl += a;
            }
            D[i] = sumDbl;
        }
        for (int i = 0; i < 2; i++) {
            D[i] += Nn[i];
        }

        // 출력
        // . = 46 ////a  0 = 48
        System.out.printf("%d + %d = %d\n", N[0], N[1], N[0] + N[1]);
        System.out.printf("%.2f + %.2f = %.2f", D[0], D[1], D[0] + D[1]);
    }
}
