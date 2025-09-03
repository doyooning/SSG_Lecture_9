package java_basic_01.day2;

public class BooleanEx {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        //int x = 30;
        //변수 x의 값이 20인가? 결과 result1에 저장
        // -> x == 20
        //변수 x의 값이 20이 아닌가? 결과 result2에 저장
        // -> x != 20
        //변수 x의 값이 0보다 크고 30보다 작은가? 결과 result3에 저장
        // -> (x > 0) && (x < 30)
        //변수 x의 값이 0보다 적거나 30보다 크거나 같은가? 결과 result4에 저장
        // -> (x < 0) || (x >= 30)

        int x = 30;
        boolean result1, result2, result3, result4;
        result1 = (x == 20);
        result2 = (x != 20);
        result3 = ((x > 0) && (x < 30));
        result4 = ((x < 0) || (x >= 30));
        System.out.printf("%b %b %b %b", result1, result2, result3, result4);
    }
}
