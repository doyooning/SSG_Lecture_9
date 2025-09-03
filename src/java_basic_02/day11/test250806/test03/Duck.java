package java_basic_02.day11.test250806.test03;

public class Duck {
    private String name;
    private int legs;
    private int length;

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.printf("오리(%s)는 날지 않습니다.\n", name);
    }

    public void sing() {
        System.out.printf("오리(%s)가 소리내어 웁니다.\n", name);
    }

    public String toString() {
        return String.format("오리의 이름은 %s 입니다.\n", name);
    }
}
