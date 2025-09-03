package java_basic_01.day3;

public class OperatorEx03 {
    public static void main(String[] args) {
        /*논리연산자
        * 논리곱(&&), 논리합(||), 배타적 논리합(^), 논리부정(!)
        * */

        int charCode = 'A';
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("알파벳 대문자입니다.");
        }

        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("알파벳 소문자입니다.");
        }

        charCode = '5';
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0-9 사이의 숫자입니다.");
        }

        // 현재 value의 값이 2의 배수 또는 3의 배수인지를 검사하는 수식?
        int value = 7;
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println();
        }

        value = 7;
        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2 또는 3의 배수가 아니에요");
        }
        int a = 59;
        char c = (char) a;
        char ch = '가';
        int d = (int) ch;
        System.out.println(d);

    }
}
