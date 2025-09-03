package java_basic_02.day13.stringPs.prob1;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		String inputStr;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("문자열을 입력하세요. : ");
		inputStr = keyboard.nextLine();

		//프로그램을 구현하세요.
		inputStr = inputStr.toUpperCase();
		StringBuffer sb = new StringBuffer(inputStr);
		sb.reverse();
		String str = sb.toString();
		System.out.println(str);
	}

}
