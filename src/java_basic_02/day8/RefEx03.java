package java_basic_02.day8;

public class RefEx03 {
    public static void main(String[] args) {
        // 리터럴 저장 방식 -> String Constant Pool 영역에 저장
        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1 == str2); // 주소값이 동일? -> true

        // new 연산자 저장 방식 -> Heap(힙) 영역에 저장
        String str3 = new String("Java");
        String str4 = new String("Java");
        // 문자열 데이터를 어떤 방식으로 저장하느냐에 따라 메모리 적재 형태가 다르다
        System.out.println("--- str3 == str4 ---");
        System.out.println(str3 == str4); // 주소값이 동일? -> false
        System.out.println(str3.equals(str4)); // 실제 저장된 값이 동일? -> true

        // 리터럴과 객체 문자열 비교
        System.out.println("--- 리터럴 vs 객체 문자열 ---");
        System.out.println(str1 == str3); // 주소값이 동일? -> false
        System.out.println(str3.equals(str1)); // 실제 저장된 값이 동일? -> true
    }
}
