package CL7.Thread.Thread3;

/**
 * @author Promise
 * @create 2019-08-12-20:51
 */
public class Demo1SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        //开启多线程
        new MyThread("旺财").start();
    }
}
