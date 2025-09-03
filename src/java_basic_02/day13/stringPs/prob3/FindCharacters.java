package java_basic_02.day13.stringPs.prob3;

public class FindCharacters {


	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);

	}
	public int countChar(String str, char c) {
		// Method를 완성하세요...
		char[] ch = str.toCharArray();
		int amount = 0;
		for (char ch1 : ch) {
			if (ch1 == c) {
				amount++;
			}
		}
		return amount;
	}
}
