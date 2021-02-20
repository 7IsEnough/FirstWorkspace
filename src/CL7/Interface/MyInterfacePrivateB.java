package CL7.Interface;

/**
 * @author Promise
 * @create 2019-07-24-15:56
 */
public interface MyInterfacePrivateB {
    public static void methodStatic1(){
        System.out.println("静态方法1");
        methodStaticCommon();
    }
    public static void methodStatic2(){
        System.out.println("静态方法2");
        methodStaticCommon();
    }


    public static void methodStaticCommon(){
        //应当修改为 private static void methodStaticCommon()   JDK 9 以上才可用
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
