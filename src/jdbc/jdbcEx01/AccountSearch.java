package jdbcEx01;

import util.DBUtil;
import vo.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountSearch {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();

        // SQL문 작성
        String sql = "select ano, owner, balance from accounts";

        // PreparedStatement 생성하고 값 지정
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery(sql);
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
