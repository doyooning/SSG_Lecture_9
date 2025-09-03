package java_advanced_01.day15.generic;

import java.util.ArrayList;
import java.util.List;

// List -> interface, 동적 저장소
public class FruitBox<T> {
    List<T> fruits = new ArrayList<>(); // Class Field

    public void add(T fruit) { // 메서드의 매개변수 타입 지정
        fruits.add(fruit);
    }
}
