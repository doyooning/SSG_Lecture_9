package jdbcEx01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bookmarketdb?serverTimezone=Asia/Seoul";
        String username = "root";
        String password = "mysql1234";

        try {
            Class.forName(driver);
            System.out.println("Driver loaded");
        } catch (Exception e) {
            System.out.println("Driver loaded failed");
        }

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            System.out.println("Autocommit 상태 : " + con.getAutoCommit());
            con.setAutoCommit(true);

            String sql = "insert into users(userid, username, userpassword, userage, useremail) values(?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "11");
            ps.setString(2, "김도윤");
            ps.setString(3, "1027");
            ps.setInt(4, 27);
            ps.setString(5, "dyniiyeyo@naver.com");

            int result = ps.executeUpdate();
            System.out.println("저장된 행의 수 : " + result);
            if (result == 1) {
                System.out.println("Insert successful!");
            } else {
                System.out.println("Insert failed!");
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
