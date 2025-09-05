package jdbcEx01;

import util.DBUtil;
import vo.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDBUtilTest {
    public static void main(String[] args) {
        try {
            Connection con = DBUtil.getConnection();

            Statement stmt = con.createStatement();
            String sql = "insert into person(id, name) values(1000000, '홍길동11')";
            int result = stmt.executeUpdate(sql);
            if (result == 1) {
                System.out.println("Insert successful");
            }


            String selectSql = "select id, name from person";
            ResultSet rs = stmt.executeQuery(selectSql);
            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getInt("id"));
                person.setName(rs.getString("name"));
                System.out.println(person.toString());
            }
        } catch (Exception e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
