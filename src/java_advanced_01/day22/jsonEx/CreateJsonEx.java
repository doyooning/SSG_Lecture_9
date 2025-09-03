package java_advanced_01.day22.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonEx {
    public static void main(String[] args) throws IOException {
        // 1. JSON 객체 생성
        JSONObject root = new JSONObject();
        // 2. 속성 추가
        root.put("id", "doyooning");
        root.put("name", "Doyoon");
        root.put("password", "1234");
        // 3. 배열 속성 추가
        JSONObject tel = new JSONObject();
        tel.put("home", "010-1111-1111");
        tel.put("mobile", "010-2222-2222");
        root.put("tel", tel);

        JSONArray skill = new JSONArray();
        skill.put("Java");
        skill.put("HTML");
        skill.put("JPA");
        root.put("skill", skill);
        // 4. JSON 얻기
        String json = root.toString();

        // 5. 콘솔에 출력
        System.out.println(json);

        // 6. 파일에 출력
        try (Writer writer = new FileWriter("kdy.json", Charset.forName("UTF-8"))) {
            writer.write(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
