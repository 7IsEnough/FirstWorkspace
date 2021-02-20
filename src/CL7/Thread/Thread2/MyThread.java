package CL7.Thread.Thread2;

/**
 * @author Promise
 * @create 2019-08-12-20:40
 */
//定义一个Thread类的子类
public class MyThread extends Thread{
    //重写Thread类中的run方法，设置线程任务
    @Override
    public void run() {
        //获取线程名称
//        String name = getName();
//        System.out.println(name);

//        Thread t = Thread.currentThread();
//        System.out.println(t);
//        String name = t.getName();
//        System.out.println(name);

        System.out.println(Thread.currentThread().getName());
    }
}
