package CL7.Interface;

/**
 * @author Promise
 * @create 2019-07-24-15:40
 */
public class Demo2Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();

        // impl.methodStatic();//错误写法

        MyInterfaceStatic.methodStatic();
    }
}
