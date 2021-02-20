package CL7.Random;

import java.util.Random;

/**
 * @author Promise
 * @create 2019-07-22-14:58
 * 带参数的Random对象方法
 */
public class Random2 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
