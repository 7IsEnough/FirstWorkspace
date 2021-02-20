package CL7.Date;

import java.util.Date;

/**
 * @author Promise
 * @create 2019-07-30-15:44
 */
public class Demo2Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    //Date类的空参数构造方法
    //Date()：获取当前系统的日期和时间
    private static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }
    //Date类的带参数构造方法
    //Date(long date)：传递毫秒值，把毫秒值转换为Date日期
    private static void demo02(){
        Date date = new Date(777777777777L);
        System.out.println(date);
    }

    //getTime()：把日期转换为毫秒值（相当于System.currentTimeMillis()方法）
    private static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}