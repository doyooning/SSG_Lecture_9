package java_basic_01.day2;

public class PromotionEx {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;

        long longValue = 50000000L;
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        // e 또는 E가 포함된 10의 거듭제곱 리터럴
        double d1 = 5e2;  // 5.0 * 10^2 = 500.0

        float f1 = 3.14f; // float 리터럴 값은 마지막에 f나 F를 붙인다.
        float f2 = 3E6F; // 3.0 * 10^6

        System.out.println(f2);

    }

}
