package java_basic_02.day8;

public class StringEx01 {
    public static void main(String[] args) {
        String subject = "자바객체프로그래밍";
        char charValue = subject.charAt(0);
        System.out.println(charValue);

        String ssn = "1242353463456456";
        char gender = ssn.charAt(0);
        switch (gender) {
            case '1':
            case '3':
                System.out.println("남성");
                break;
            case '2':
            case '4':
                System.out.println("여성");
                break;
        }
        int length = ssn.length();
        System.out.println(length);

        String oldStr = "신세계 자바 과정";
        String newStr = oldStr.replace("자바", "자바 백엔드");
        System.out.println(newStr);

        // 문자열 잘라내기 : substring()
        // substring(int beginIndex), substring(int beginIndex, int endIndex)
        String ssn1 = "880815-1234567";

        // - 기준으로 앞숫지문자열과 뒤숫자 분리 후 각각 추출하여 출력
        String firstNum = ssn1.substring(0, 6);
        System.out.println(firstNum);
        String lastNum = ssn1.substring(7);
        System.out.println(lastNum);

        // 문자열 찾기 : 문자열에서 특정 문자의 위치 찾을 때 indexOf()
        int index = subject.indexOf("프로그래밍");
        if (index == -1) {
            System.out.println("포함되어 있지 않다.");
        } else {
            System.out.println("포함되어 있다.");
        }
        System.out.println(index);

        // 문자열 포함 여부 확인 : contains()
        boolean result = subject.contains("프로그래밍");
        System.out.println(result);

        // 문자열 분리 : split()
        // 여러 개의 문자열로 구성시, 이를 따로 분리해서 문자열을 처리하고 싶다면
        String board = "번호,제목,내용,설명";
        String[] boardStr = board.split(",");
        System.out.println();
        for (String s : boardStr) {
            System.out.print(s + " ");
        }
    }
}
