package java_advanced_01.day17.quiz;

// 과일을 가격 기준으로 오름차순 정렬하는 비교기를 구현하기
public class Fruit implements Comparable<Fruit> {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Fruit o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
