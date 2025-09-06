package java_advanced_01.day22.practice.Prob1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;
}
