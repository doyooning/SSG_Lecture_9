package java_advanced_01.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringEx01 {
    public static void main(String[] args) {
        // List 컬렉션 ArrayList 생성
        // List에 5명의 이름을 저장

        List<String> list = new ArrayList<>();
        list = Arrays.asList(
                new String("apple"),
                new String("banana"),
                new String("banana"),
                new String("candy"),
                new String("candy"),
                new String("dog"),
                new String("elephant")
        );

//        list.stream()
//                .distinct()
//                .forEach(System.out::println);

        // list 중복 제거 후 an이 들어간 요소 출력
        list.stream()
                .distinct()
                .filter(s -> s.contains("an"))
                .forEach(System.out::println);

    }
}
