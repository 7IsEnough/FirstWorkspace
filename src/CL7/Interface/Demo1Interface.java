package CL7.Interface;

/**
 * @author Promise
 * @create 2019-07-24-15:07
 */
public class Demo1Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();  //调用了抽象方法，实际运行的是右侧的实现类

        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();
        System.out.println("=============");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
