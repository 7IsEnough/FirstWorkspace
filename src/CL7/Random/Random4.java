package CL7.Random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Promise
 * @create 2019-07-22-15:07
 * 二分查找法找随机数
 */
public class Random4 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;//[1,100]
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入你猜测的数字");
            int guessNum = sc.nextInt();

            if(guessNum > num){
                System.out.println("太大了，请重试");
            }else if(guessNum < num){
                System.out.println("太小了，请重试");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
