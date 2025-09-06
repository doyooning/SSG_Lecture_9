package java_basic_02.day13.stringPs.prob3;

public class FindNumbers {
	
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();

		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );		
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
	}

	/*  이곳에 countNumber 메소드를 작성하십시오. */
	int countNumber(long number, int i) {
		char[] ch = String.valueOf(number).toCharArray();
		int count = 0;
        for (char c : ch) {
            if (Integer.parseInt(String.valueOf(c)) == i) {
                count++;
            }
        }
		return count;
	}
}
