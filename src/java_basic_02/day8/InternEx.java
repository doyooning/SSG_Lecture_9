package java_basic_02.day8;

/* intern() : 문자열을 최적화 관리를 위한 메서드
 * 문자열을 리터럴로 선언시 내부적으로 String의 intern() 메서드 호출
 * 해당 리터럴이 문자열 상수 pool 안에 존재하는지 확인
 * - 만약 존재하면 해당 pool의 리터럴을 리턴
 *   존재하지 않으면 리터럴을 pool 안에 집어넣고 새로운 주소값을 반환
 */
public class InternEx {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'}).intern();

        System.out.println(str1 == str2); // true
        // 해당 코드의 의미는 무엇인가?

        String str3 = "Hi";
        String str4 = new String("Hi");

        str3 = str3.intern();
        System.out.println(str3 == str4); // false
        // 문자열을 intern() 하는건 의미 없음
    }
}
