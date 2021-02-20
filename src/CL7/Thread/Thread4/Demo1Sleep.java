package CL7.Thread.Thread4;

/**
 * @author Promise
 * @create 2019-08-12-20:59
 */
public class Demo1Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法让程序睡眠1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
