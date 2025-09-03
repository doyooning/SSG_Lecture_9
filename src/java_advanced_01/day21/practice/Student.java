package java_advanced_01.day21.practice;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}
