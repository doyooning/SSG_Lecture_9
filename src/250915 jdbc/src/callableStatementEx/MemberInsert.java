package callableStatementEx;

import jdbc_boards.util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;


public class MemberInsert {
    static Connection conn = DBUtil.getConnection();

    public static void main(String[] args) {

        String m_userid = "dynii";
        String m_pwd = "1q2w3e4r!";
        String m_email = "dyniiyeyo@naver.com";
        String m_hp = "010-4255-1027";

        String sql = "{CALL SP_MEMBER_INSERT(?,?,?,?,?)}";

        try (CallableStatement call = conn.prepareCall(sql)) {

            // IN 파라미터 세팅
            call.setString(1, m_userid);
            call.setString(2, m_pwd);
            call.setString(3, m_email);
            call.setString(4, m_hp);

            //
            call.registerOutParameter(5, Types.INTEGER);

            // 실행
            call.execute();

            int rtn = call.getInt(5);
            if (rtn == 100) {
//                conn.rollback();
                System.out.println("이미 가입된 사용자입니다.");
            } else {
//                conn.commit();
                System.out.printf("%s님, 회원가입을 환영합니다.\n", m_userid);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}