package java_basic_02.day13.stringPs.prob1;

public class Prob1 {

	public static void main(String args[]) {

		Prob1 prob1 = new Prob1();

		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 5, '$') );
		System.out.println( prob1.leftPad("SDS", 2, '&') );

	}

	public String leftPad(String str, int size, char padChar) {

		/*  여기에 프로그램을 완성하십시오. */
		StringBuffer sb = new StringBuffer(str);
		if (sb.length() > size) {
			return str;
		}

		for (int i = str.length(); i < size; i++) {
			sb.insert(0, padChar);
		}
		return sb.toString();
	}

}
