package java_advanced_01.day19;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        for (String item : list) {
            System.out.println(item);
        }

        // Java8부터 Stream을 사용하여 요소들이 하나씩 흘러가면서 처리하는 방식 제시
        // 병렬처리 가능, 속도 빠름
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        // Set에 홍길동, 김나무, 김꽃분 3명의 회원을 저장, 이름을 stream으로 출력
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("김나무");
        set.add("김꽃분");
        set.forEach(System.out::println);
        set.stream().forEach(name -> System.out.println(name));
    }
}
