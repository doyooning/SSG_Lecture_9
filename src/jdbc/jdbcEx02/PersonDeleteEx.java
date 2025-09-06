package jdbcEx02;

import util.DBUtil;
import vo.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
* JDBC를 이용하여 데이터 삭제를 하는 delete문을 실행하는 방법
* delete from 테이블명; -> 해당 테이블의 모든 행을 지움
* delete from 테이블명 where id = 식별값; -> 해당 식별값의 행만 지움
* delete from person where num = 1; -> person 테이블의 pk num = 1 행을 삭제
* String sql = "delete from person where num = ?";
* */
public class PersonDeleteEx {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();

        // SQL문 작성
        String sql = "delete from person where id = ?";

        // PreparedStatement 생성하고 값 지정
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, 150);
            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행의 수 : " + rows);

            String selectSql = "select id, name from person";
            ResultSet rs = pstmt.executeQuery(selectSql);
            while (rs.next()) {
                vo.Person person = new Person();
                person.setId(rs.getInt(1));
                person.setName(rs.getString(2));
                System.out.println(person.toString());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
