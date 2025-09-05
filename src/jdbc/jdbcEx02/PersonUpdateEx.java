package jdbcEx02;

// update 테이블명 set (필드 = '수정값') where num = 1;
// String sql = "update person set id = ?, name = ? where num = ?";

/* String sql = new StringBuilder()
               .append("update person ")
               .append("set id = ? ") ...
               .toString();*/

import util.DBUtil;
import vo.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonUpdateEx {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();

        // 매개변수화된 update sql문 작성
        String sql = new StringBuilder()
                .append(" update person set")
                .append(" id = ?, ")
                .append(" name = ? ")
                .append(" where num = ?").toString();

        // PreparedStatement 객체 생성하고 값 지정
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, 150);
            pstmt.setString(2, "도우너");
            pstmt.setInt(3, 1);

        // SQL문 실행
        int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows updated");

            String selectSql = "select id, name from person";
            ResultSet rs = pstmt.executeQuery(selectSql);
            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getInt(1));
                person.setName(rs.getString(2));
                System.out.println(person.getId() + " " + person.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
