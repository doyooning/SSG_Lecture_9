package java_basic_02.day8.stringBufferEx;

public class StringBufferEx02 {
    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuffer sb = new StringBuffer(str);


        // StringBuffer를 String 타입으로 변환
        System.out.println("초기상태 : " + sb.toString());

        //str 문자열에서 "cd"를 출력
        System.out.println("문자열 추출 : " + str.substring(2, 4));

        //sb 문자열 인덱스 2 위치에 "2" 추가
        System.out.println("문자 추가 : " + sb.insert(2, "2"));

        //sb에 문자열 삭제 (인덱스 2, 3 삭제)
        System.out.println("문자 삭제 : " + sb.delete(2, 4));

        //sb에 문자열 붙이기
        System.out.println("문자 붙이기 : " + sb.append("hijk"));

        //sb의 길이 : length
        System.out.println("문자열 길이 : " + sb.length());

        //Buffer 용량
        System.out.println("용량 : " + sb.capacity());

        //문자열의 역순 : reverse()
        System.out.println("문자열의 역순 : " + sb.reverse());

        //현상태 문자열 확인
        System.out.println("마지막 상태 체크 : " + sb);
    }
}
