package java_basic_02.day9;

import java.util.Scanner;

public class ComputerMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        String inputStr = sc.nextLine();

        int[] intArr = computer1.setIntArr(inputStr);
        computer1.totalSum(intArr);
    }
}
