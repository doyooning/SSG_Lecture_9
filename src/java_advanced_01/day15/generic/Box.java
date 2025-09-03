package java_advanced_01.day15.generic;

public class Box {
    public Object content;
    // Object 타입은 모든 클래스의 최상위 부모 클래스
    // -> 모든 객체는 Object로 자동 타입 변환이 가능
    // = content는 어떤 객체든 대입이 가능
    public static void main(String[] args) {
        Box box = new Box();
        box.content = "Barbie Doll";
        box.content = 100;
        box.content = 1000.088;
        // Box의 내용물을 얻을 때가 문제
        // content는 Object 타입이므로 어떤 객체가 대입되었는지 확실히 알 수 X
        String doll = (String) box.content;
        // 어떤 내용물이 저장되었는지 모른다면 instanceof를 이용하여 타입조사 가능

    }
}
