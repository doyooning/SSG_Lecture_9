package java_advanced_01.day15.generic;

import java.util.Arrays;

public class BoxModelMain {
    public static void main(String[] args) {
        // 배추, 무, 상추, 삼겹살 구매, 물품 담아서 box에 담기
        // box 담긴 내용 출력
        String[] str = {"배추", "무", "상추", "삼겹살"};

        BoxModel<String> box = new BoxModel<>();
        box.content.addAll(Arrays.asList(str));

    }
}
