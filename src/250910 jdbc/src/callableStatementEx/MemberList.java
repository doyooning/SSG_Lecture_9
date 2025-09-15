package callableStatementEx;

import jdbc_boards.util.DBUtil;

import java.sql.*;


public class MemberList {
    static Connection conn = DBUtil.getConnection();

    public static void main(String[] args) {

        String sql = "{CALL SP_MEMBER_LIST()}";

        try (CallableStatement call = conn.prepareCall(sql)) {


            // 실행
            call.execute();

            ResultSet rs = call.getResultSet();
            while (rs.next()) {
                System.out.printf("순번 %5d | ID %10s | PW %15s | EMAIL %25s | 전화번호 %15s | 등록일 %s | 포인트 %5d\n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)
                        );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}