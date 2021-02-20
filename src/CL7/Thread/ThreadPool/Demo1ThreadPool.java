package CL7.Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Promise
 * @create 2019-08-14-10:49
 */
public class Demo1ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池的工厂类Executors里面提供的静态方法newFixedThreadPool
        //生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //3.调用ExecutorService中的submit方法，传递线程任务，开启线程，执行run方法
        es.submit(new RunnableImpl());
        //线程池会一直开启，使用完了线程，会自动把线程归还给线程池，线程可以继续使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());



        //4.调用ExecutorService中的方法shutdown销毁线程池(不建议执行)
        es.shutdown();
        es.submit(new RunnableImpl());//会抛异常，线程池销毁了，就无法获取线程
    }
}
