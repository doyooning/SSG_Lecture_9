package jdbcEx01;

import util.DBUtil;
import vo.Account;
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
public class AccountDelete {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();

        // SQL문 작성
        String sql = "delete from accounts where ano = ?";

        // PreparedStatement 생성하고 값 지정
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "222-222-2222");
            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행의 수 : " + rows);

            String selectSql = "select ano, owner, balance from accounts";
            ResultSet rs = pstmt.executeQuery(selectSql);
            while (rs.next()) {
                Account account = new Account();
                account.setAno(rs.getString(1));
                account.setOwner(rs.getString(2));
                account.setBalance(rs.getInt(3));
                System.out.println(account.getAno() + " " + account.getOwner() + " " + account.getBalance());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
