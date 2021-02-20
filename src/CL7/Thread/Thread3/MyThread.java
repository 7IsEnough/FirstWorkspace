package CL7.Thread.Thread3;

/**
 * @author Promise
 * @create 2019-08-12-20:51
 */
public class MyThread extends Thread{
    public MyThread(){}

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}
