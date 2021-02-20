package CL7.Date.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Promise
 * @create 2019-07-30-16:05
 */
public class Demo1DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }



    //使用DateFormat类中的方法format，把日期格式化为文本
    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }

    //使用DateFormat类中的方法parse，把文本解析为日期
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = sdf.parse("2019-07-30 16:59:24");
        System.out.println(date);
    }
}
