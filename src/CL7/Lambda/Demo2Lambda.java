package CL7.Lambda;

/**
 * @author Promise
 * @create 2019-08-14-14:33
 */
public class Demo2Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();

        //使用Lambda表达式，实现多线程
        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        ).start();

        //优化省略Lambda表达式(省略{}，;)
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"新线程创建了")).start();
    }
}
