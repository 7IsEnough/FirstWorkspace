package CL7.Thread.Runnable;

/**
 * @author Promise
 * @create 2019-08-12-21:37
 */
public class Demo1Runnable{
    public static void main(String[] args) {
        //3.创建一个Runnable的实现类对象
        RunnableImpl run = new RunnableImpl();
        //4.创建Thread类对象，构造方法中传递Runnable接口的实现类
        Thread t = new Thread(run);
        //5.调用Thread类中的start方法，开启新的线程执行run方法
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
