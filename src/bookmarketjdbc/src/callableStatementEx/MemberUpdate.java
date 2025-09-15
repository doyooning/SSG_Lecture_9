package callableStatementEx;

import jdbc_boards.util.DBUtil;

import java.sql.*;


public class MemberUpdate {
    static Connection conn = DBUtil.getConnection();

    public static void main(String[] args) {

        int num = 1;
        String userid = "apple";
        String pwd = "123456";
        String sql = "{CALL SP_MEMBER_UPDATE(?,?,?,?)}";

        try (CallableStatement call = conn.prepareCall(sql)) {

            call.setInt(1, num);
            call.setString(2, userid);
            call.setString(3, pwd);

            call.registerOutParameter(4, Types.INTEGER);

            // 실행
            call.execute();

            int rtn = call.getInt(4);
            if (rtn == 0) {
                System.out.println("해당 회원을 찾을 수 없습니다.");
            } else {
                System.out.println("수정이 완료되었습니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}