package CL7.StringBuilder;

/**
 * @author Promise
 * @create 2019-07-31-16:06
 */
public class Demo2StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
//        //使用append方法返回的是this，调用方法的对象bu，this == bu
//        StringBuilder bu2 = bu.append("abc");
//        System.out.println(bu);
//        System.out.println(bu2);
//        System.out.println(bu == bu2);

        //使用append方法无需接收返回值
//        bu.append("abc");
//        bu.append(1);
//        bu.append(true);
//        bu.append(8.8);
//        bu.append('中');
//        System.out.println(bu);

        /*
        * 链式编程：方法返回值是一个对象，可以继续调用方法
        */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu.append("abc").append(1).append(true).append(8.8).append('中');
        System.out.println(bu);
    }
}
