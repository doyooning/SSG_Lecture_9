package java_advanced_01.day22.practice.Prob5;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private int orderId;
    private Product product;
}
