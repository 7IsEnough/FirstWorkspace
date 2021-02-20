package CL7.Thread.InnerClassThread;

/**
 * @author Promise
 * @create 2019-08-12-21:58
 */
public class Demo1InnerClassThread {
    public static void main(String[] args) {
        //线程的父类为Thread
        //new MyThread().start()
        new Thread(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"明凯");
                }
            }
        }.start();

        //线程的接口是Runnable
        //Runnable r = new RunnableImpl();  多态
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"clearlove");
                }
            }
        };
        new Thread(r).start();

        //简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"promise");
                }
            }
        }).start();
    }

}
