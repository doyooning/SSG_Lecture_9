package java_advanced_01.day20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "신세계", "이세계", "김윤진", "정현주"
        );
        // 자연 순서(Nature Order)로 이름 정렬하여 출력
        List<String> sortedNames = names.stream()
                .sorted().toList();
        System.out.println(sortedNames);
        // 자료를 다시 써야 하면 stream-forEach까지 다 해버리는게 아니라
        // 배열로 저장해놓고 따로 프린트해주는게 좋음

        // 내림차순 정렬
        List<String> sortedNames1 = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNames1);

        // 중간 연산 체이닝
        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie", "Dan", "Eve");

        // names2의 이름 중 "D"로 시작하는 이름을 모두 대문자로 바꾸어, 자연 정렬하여 출력
        List<String> sortedNames2 = names2.stream()
                .filter(name -> name.startsWith("D"))
                .map(name -> name.toUpperCase())
                .sorted().toList();
        System.out.println(sortedNames2);
    }
}
