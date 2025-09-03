package java_advanced_01.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // products에 제품 저장
        products.add(new Product("1", "빈츠", "빈츠굿", 1000));
        products.add(new Product("2", "오감자", "오감자굿", 2000));
        products.add(new Product("3", "오예스", "오예스굿", 3000));
        products.add(new Product("4", "뿌셔뿌셔", "뿌셔뿌셔굿", 4000));
        products.add(new Product("5", "생각이안나요", "좋은곳", 5000));

        Stream<Product> ps = products.stream();
        ps.forEach(System.out::println);
    }
}
