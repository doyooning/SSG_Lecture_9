package callableStatementEx;

import jdbc_boards.util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberDelete {
    static Connection conn = DBUtil.getConnection();

    public static void main(String[] args) {

        String userid = "apple";
        String sql = "{CALL SP_MEMBER_SEARCH(?)}";

        try (CallableStatement call = conn.prepareCall(sql)) {

            call.setString(1, userid);
            // 실행
            call.execute();

            ResultSet rs = call.getResultSet();
            while (rs.next()) {
                System.out.printf("순번 %5d | ID %10s | EMAIL %25s | 전화번호 %15s | 등록일 %s | 포인트 %5d\n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6)
                        );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}