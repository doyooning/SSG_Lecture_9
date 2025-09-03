package java_basic_01.day4;

public class RandomEx01 {
    public static void main(String[] args) {
//        Math.random(); // 0.0 ~ 1.0 사이의 double값을 반환
//        0.0 <= Math.random() < 1.0
        /*
        * <0 ~ 5 사이의 랜덤 정수를 뽑고 싶다 !>
        * 1. 숫자 6개를 뽑으니까 6을 곱해준다고 생각한다
        *  -> 0.xxx ~ 5.xxx 처럼 난수 생성
        * 2. 정수로 캐스팅
        *  -> int로 캐스팅하면 소수점 밑에 날라가고 0 ~ 5만 반환
        * */
        System.out.println("3번을 연달아 주사위를 던지고 나온 값을 출력하세요");

        int num = 0;
        for (int i = 1; i < 4; i++) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println(i + "번째 나온 주사위 수 " + num);
        }

    }
}
