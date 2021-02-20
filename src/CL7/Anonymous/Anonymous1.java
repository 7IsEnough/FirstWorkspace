package CL7.Anonymous;

import java.util.Scanner;

/**
 * @author Promise
 * @create 2019-07-22-14:36
 * 匿名对象作为方法的参数与返回值
 */
public class Anonymous1 {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //匿名对象方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num);

        //使用一般方法传入参数
//          Scanner sc = new Scanner(System.in);
//          methodParam(sc);

        //使用匿名对象进行调参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
