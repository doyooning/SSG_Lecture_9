package java_advanced_01.day17.comparatorEx;

// 과일을 가격 기준으로 오름차순 정렬하는 비교기를 구현하기
public class Fruits implements Comparable<Fruits> {
    public String name;
    public int price;

    public Fruits(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Fruits o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
