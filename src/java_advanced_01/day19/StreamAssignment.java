package java_advanced_01.day19;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssignment {
    public static void main(String[] args) {
/*        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream().filter(str ->
                str.toLowerCase().contains("java")).forEach(System.out::println);*/

/*        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("고길동", 40),
                new Member("감자바", 26)
        );

        double avg = list.stream()
                .mapToInt(member -> member.getAge())
                .average().getAsDouble();

        System.out.println("평균 나이: " + avg);*/
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );
        List<Member> developers = list.stream().filter(member ->
                member.getJob().equals("개발자")).collect(Collectors.toList());
        developers.stream().forEach(m -> System.out.println(m.getName()));
    }
}
