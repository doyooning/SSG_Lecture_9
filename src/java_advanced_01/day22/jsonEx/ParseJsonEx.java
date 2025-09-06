package java_advanced_01.day22.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

public class ParseJsonEx {
    public static void main(String[] args) {
        // 파일로부터 JSON 읽어오기
        try (BufferedReader br = new BufferedReader(new FileReader("kdy.json", Charset.forName("UTF-8")))) {
            String json = br.readLine();
            JSONObject root = new JSONObject(json);

            System.out.println("아이디 = " + root.getString("name"));
            JSONObject obj = root.getJSONObject("tel");
            System.out.println("집전화 = " + obj.getString("home"));
            System.out.println("휴대폰 = " + obj.getString("mobile"));

            JSONArray skill = root.getJSONArray("skill");
            System.out.print("skill: ");
            for (int i = 0; i < skill.length(); i++) {
                System.out.print(skill.get(i) + " ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
