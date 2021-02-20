package CL7.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author promise
 * @date 2019/11/5 - 21:15
 * 执行DDL语句，表的创建
 */
public class JDBCDemo5 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.编写sql语句
            String sql = "create table student (id int, name varchar(20))";
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?serverTimezone=GMT%2B8","root","1234");
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            int count = stmt.executeUpdate(sql);
            //6.查看是否修改成功
            System.out.println(count);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
