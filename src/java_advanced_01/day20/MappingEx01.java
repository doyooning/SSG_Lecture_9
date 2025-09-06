package java_advanced_01.day20;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
}

public class MappingEx01 {
    public static void main(String[] args) {
        // 학생 3명 리스트컬렉션 생성
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("John", 90));
        students.add(new Student2("Jake", 100));
        students.add(new Student2("Lisa", 80));

        //학생들의 점수를 stream() 방법으로 출력
        students.stream()
                .forEach(s -> System.out.println(s.getScore()));

        // 학생들의 총점을 출력
        int sum =
        students.stream()
                .mapToInt(s -> s.getScore())
                .sum();
        System.out.println(sum);

        // 학생들의 점수의 평균 출력(소수 첫째자리까지)
        double avg =
        students.stream()
                .mapToDouble(s -> s.getScore())
                .average().getAsDouble();
        System.out.printf("%.1f", avg);
    }
}
