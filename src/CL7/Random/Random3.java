package CL7.Random;

import java.util.Random;

/**
 * @author Promise
 * @create 2019-07-22-15:02
 * 根据int变量n的值，获取随机数，范围[1,n]
 */
public class Random3 {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }


    }
}
