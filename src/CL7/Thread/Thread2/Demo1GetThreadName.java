package CL7.Thread.Thread2;

/**
 * @author Promise
 * @create 2019-08-12-20:40
 */
public class Demo1GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用start方法，开启新线程，执行run方法
        mt.start();

        new MyThread().start();
        System.out.println(Thread.currentThread().getName());
    }
}
