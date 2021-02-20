package CL7.Static;

/**
 * @author Promise
 * @create 2019-07-23-10:50
 * static修饰成员方法
 */
public class MyClass {

    int num;
    static int numStatic;

    public void method(){
        System.out.println("这是一个普通的成员方法。");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态方法不能直接访问非静态变量
//        System.out.println(num);//错误写法
        //静态方法不能使用this关键字
//        System.out.println(this);//错误写法
    }


}
