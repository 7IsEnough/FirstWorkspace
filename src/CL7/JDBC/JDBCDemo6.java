package CL7.JDBC;

import java.sql.*;

/**
 * @author promise
 * @date 2019/11/6 - 21:16
 */
public class JDBCDemo6 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.编写sql语句
            String sql = "select * from account";
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?serverTimezone=GMT%2B8","root","1234");
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.查看是否修改成功
            //让油标向下移动一行
            rs.next();
            //获取数据
            int id = rs.getInt(1);
            String name = rs.getString("name");
            double balance = rs.getDouble(3);

            System.out.println(id+"---"+name+"---"+balance);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
