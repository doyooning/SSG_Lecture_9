package java_advanced_01.day19;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Product {

    // 제품번호(pno), 제품이름(pName), 제조사(pCompany), 가격(price)
    private String pno;
    private String pName;
    private String pCompany;
    private int price;
}

