package CL7.Lambda;

/**
 * @author Promise
 * @create 2019-08-14-14:13
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建了");
    }
}
