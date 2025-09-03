package java_advanced_01.day20;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
class Student2 {
    private String name;
    private int score;
}

public class Main1 {
    public static void main(String[] args) {
        List<Student2> students = Arrays.asList(
                new Student2("Alice", 92),
                new Student2("Bob", 95),
                new Student2("David", 85)

        );

        int sum1 = students.stream().mapToInt(Student2::getScore).sum();
        int sum2 = students.stream().mapToInt(Student2::getScore).reduce(0, (a, b) -> a + b);
        int sum3 = students.stream().mapToInt(Student2::getScore).reduce(0, (a, b) -> a + b);

    }

}
