package CL7.Thread.Thread1;

/**
 * @author Promise
 * @create 2019-08-12-20:16
 */
public class Demo1Thread {
    public static void main(String[] args) {
        //3.创建Thread子类的对象
        MyThread mt = new MyThread();
        //4.调用Thread类中的方法start方法，开启新的线程，执行run方法
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
