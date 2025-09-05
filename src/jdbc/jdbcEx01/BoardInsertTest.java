package jdbcEx01;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardInsertTest {
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

            String sql = "insert into boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata) values(?, ?, ?, now(), ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, "제목임");
            pstmt.setString(2, "내용임");
            pstmt.setString(3, "글쓴이임");
            pstmt.setString(4, "spring.jpg");
            pstmt.setBlob(5, new FileInputStream("C:/Temp/spring.jpg"));

            int result = pstmt.executeUpdate();
            System.out.println("저장된 행의 수 : " + result);

            if (result == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int bno = rs.getInt(1);
                    System.out.println("bno : " + bno);
                }
                rs.close();
                System.out.println("Insert successful!");
            } else {
                System.out.println("Insert failed!");
            }

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
