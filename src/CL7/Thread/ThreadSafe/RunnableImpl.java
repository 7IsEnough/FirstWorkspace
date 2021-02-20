package CL7.Thread.ThreadSafe;

/**
 * @author Promise
 * @create 2019-08-13-10:28
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private int ticket = 100;

    //设置线程任务
    @Override
    public void run() {
        //使用死循环,让买票操作重复执行
        while (true){
            //提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //先判断票是否存在
            if(ticket > 0){
                //票存在，将票卖出 ticket--
                System.out.println(Thread.currentThread().getName()+"->正在卖第"+ticket+"张票");
                ticket--;
            }
        }

    }
}
