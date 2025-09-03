package java_basic_02.day9;

public class Computer {
    // 배열 생성
    public int[] setIntArr(String str) {
        int num = Integer.parseInt(str);
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = i+1;
        }
        return numArr;
    }

    // 누적합
    public void totalSum(int[] N) {
        int sum = 0;
        for (int i : N) {
            sum += i;
        }
        System.out.printf("1부터 %d까지의 누적합은 %d입니다.", N[N.length-1], sum);
    }
}
