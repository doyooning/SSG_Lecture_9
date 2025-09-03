package java_advanced_01.day20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ethan");

        // 이름 중 A로 시작하는 이름 수집하여 출력
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);
        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");

        // 각 이름의 길이를 세어 출력
        names2.stream()
                .forEach(name -> System.out.println(name.length()));

    }
}
