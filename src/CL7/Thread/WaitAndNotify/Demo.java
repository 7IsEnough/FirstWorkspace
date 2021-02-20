package CL7.Thread.WaitAndNotify;

/**
 * @author Promise
 * @create 2019-08-13-21:36
 */
public class Demo {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建包子铺线程，开始生产包子
        new BaoZiPu(bz).start();
        //创建吃货线程，开始吃包子
        new ChiHuo(bz).start();
    }
}
