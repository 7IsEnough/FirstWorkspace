package CL7.Static.Arrays;

/**
 * @author Promise
 * @create 2019-07-23-14:17
 * 常用的数学运算相关方法
 */
public class DemoMath {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("=============");

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println("=============");

        //向下取整
        System.out.println(Math.floor(30.9));
        System.out.println("=============");

        //四舍五入
        System.out.println(Math.round(10.5));
        System.out.println(Math.round(20.4));
    }
}
