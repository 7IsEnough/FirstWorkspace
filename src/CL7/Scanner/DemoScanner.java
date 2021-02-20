package CL7.Scanner;

import java.util.Scanner;  //导包

/**
 * @author Promise
 * @create 2019-07-22-13:42
 */
public class DemoScanner {
    public static void main(String[] args) {
        //System.in表示从键盘输入
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("输入的int数字是："+num);

        String str = sc.next();
        System.out.println("输入的字符串是："+str);
    }
}
