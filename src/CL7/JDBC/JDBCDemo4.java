package CL7.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author promise
 * @date 2019/11/5 - 21:11
 * account表 删除一条记录
 */
public class JDBCDemo4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.编写sql语句
            String sql = "delete from account where id = 3";
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?serverTimezone=GMT%2B8","root","1234");
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            int count = stmt.executeUpdate(sql);
            //6.查看是否修改成功
            System.out.println(count);
            if(count>0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
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
