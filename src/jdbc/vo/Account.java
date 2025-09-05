package vo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    private String ano;
    private String owner;
    private int balance;
}
