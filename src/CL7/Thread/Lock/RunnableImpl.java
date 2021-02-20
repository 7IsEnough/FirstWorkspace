package CL7.Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Promise
 * @create 2019-08-13-10:28
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private int ticket = 100;

    //1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();


//    //设置线程任务
//    @Override
//    public void run() {
//        //使用死循环,让买票操作重复执行
//        while (true){
//            //2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
//            l.lock();
//            //先判断票是否存在
//            if(ticket > 0){
//                //提高安全问题出现的概率，让程序睡眠
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //票存在，将票卖出 ticket--
//                System.out.println(Thread.currentThread().getName()+"->正在卖第"+ticket+"张票");
//                ticket--;
//            }
//            //3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
//            l.unlock();
//        }
//
//    }



    //设置线程任务(更好的写法)
    @Override
    public void run() {
        //使用死循环,让买票操作重复执行
        while (true){
            //2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
            l.lock();
            //先判断票是否存在
            if(ticket > 0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    //票存在，将票卖出 ticket--
                    System.out.println(Thread.currentThread().getName()+"->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    l.unlock();//无论程序是否异常，都会把锁释放
                }

            }

        }

    }
}
