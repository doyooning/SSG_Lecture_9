package java_advanced_01.day17.mapEx;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(PropertiesEx.class.getResourceAsStream("database.properties"));
        String driver = p.getProperty("driver");
        System.out.println(driver);
    }
}
