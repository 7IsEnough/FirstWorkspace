package CL7.Thread;

/**
 * @author Promise
 * @create 2019-08-12-18:55
 * 主线程：执行主(main)方法的线程
 */
public class Demo1MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
//        System.out.println(0/0);//若出现异常，则下方程序无法执行

        Person p2 = new Person("旺财");
        p2.run();
    }

}
