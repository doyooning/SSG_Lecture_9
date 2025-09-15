package callableStatementEx;

import jdbc_boards.util.DBUtil;

import java.sql.*;


public class MemberDelete {
    static Connection conn = DBUtil.getConnection();

    public static void main(String[] args) {

        String userid = "dynii";
        String sql = "{CALL SP_MEMBER_DELETE(?,?)}";

        try (CallableStatement call = conn.prepareCall(sql)) {

            call.setString(1, userid);

            call.registerOutParameter(2, Types.INTEGER);
            // 실행
            call.execute();

            int rtn = call.getInt(2);
            if (rtn == 0) {
                System.out.println("해당 회원을 찾을 수 없습니다.");
            } else {
                System.out.println("삭제가 완료되었습니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}