package CL7.FunctionalInterface.LambdaTest;

/**
 * @author Promise
 * @create 2019-08-22-8:59
 */
public class Demo1Runnable {
    public static void main(String[] args) {
        //调用方法，参数为接口，可以传递匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"->"+"线程启动了");
            }
        });
        //调用方法，参数为函数式接口，可以传递Lambda表达式
        startThread(()->System.out.println(Thread.currentThread().getName()+"->"+"线程启动了"));

    }
    //定义一个方法startThread，方法的参数使用函数式接口Runnable
    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }



}
