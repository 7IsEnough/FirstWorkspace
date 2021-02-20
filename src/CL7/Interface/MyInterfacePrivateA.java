package CL7.Interface;

/**
 * @author Promise
 * @create 2019-07-24-15:56
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }
    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }


    public default void methodCommon(){
        //应当修改为 private void methodCommon()   JDK 9 以上才可用
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
