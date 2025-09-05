package jdbcEx01;

import util.DBUtil;
import vo.Account;
import vo.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountUpdate {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();

        // 매개변수화된 update sql문 작성
        String sql = "update accounts set balance = ? where ano = ?";

        // PreparedStatement 객체 생성하고 값 지정
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, 9999);
            pstmt.setString(2, "555-555-5555");

        // SQL문 실행
        int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows updated");

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
            e.printStackTrace();
        }



    }
}
