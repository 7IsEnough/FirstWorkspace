package CL7.Random;

import java.util.Random;

/**
 * @author Promise
 * @create 2019-07-22-14:47
 * 获取一个int随机数并打印
 */
public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是："+num);
    }
}
