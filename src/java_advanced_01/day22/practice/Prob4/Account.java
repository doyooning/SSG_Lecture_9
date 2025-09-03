package java_advanced_01.day22.practice.Prob4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Account implements Serializable {
    private String owner;
    private transient int balance;
}
