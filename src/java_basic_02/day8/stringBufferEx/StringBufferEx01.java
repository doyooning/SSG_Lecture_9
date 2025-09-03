package java_basic_02.day8.stringBufferEx;

public class StringBufferEx01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java Programming");
        String result = sb.toString();
        System.out.println(result);

        /*연산자 이용해서 결합하면 내용이 합쳐진 새로운 String 인스턴스 생성
        * 많이 연산할수록 메모리 낭비, 속도 저하
        * StringBuffer 클래스는 내부에 버퍼(16개의 문자를 저장, 생성자 통해 생성
        * 바로바로 추가 가능, 공간 낭비없이 문자열 연산 속도 빠르게 처리 가능
        * */
    }
}
