package java_basic_02.day11.test250806.test03;

public class Sparrow {
    private String name;
    private int legs;
    private int length;

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.printf("참새(%s)는 날아다닙니다.\n", name);
    }

    public void sing() {
        System.out.printf("참새(%s)가 소리내어 웁니다.\n", name);
    }

    public String toString() {
        return String.format("참새의 이름은 %s 입니다.\n", name);
    }
}
