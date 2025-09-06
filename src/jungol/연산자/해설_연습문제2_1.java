package jungol.연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 해설_연습문제2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // cpu - 버퍼 장착, 스트리밍~ (데이터 지속 전송 빨리빨리)
        int[] arr = new int[5];

        System.out.print("5개의 수를 입력하시오. ");
        for (int i = 0; i < 5; i++) {
            int input = Integer.parseInt(br.readLine());
        // readLine() : String을 리턴, int로 변환해줍시다
        // 예외처리 필요 !!!!
            switch (i) {
                case 0 -> {
                    arr[i] = input + 3;
                }
                case 1 -> {
                    arr[i] = input - 3;
                }
                case 2 -> {
                    arr[i] = input * 3;
                }
                case 3 -> {
                    arr[i] = (int) (input / 3);
                }
                case 4 -> {
                    arr[i] = input % 3;
                }
                // switch와 case 요렇게 쓴다 굿
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        br.close();
    }
}
