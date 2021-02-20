package CL7.Interface;

/**
 * @author Promise
 * @create 2019-07-24-13:58
 */
public class DemoInterface {
    public static void main(String[] args) {
        //错误写法，不能直接new接口对象直接使用
//        MyinterfaceAbstract inter = new MyInterfaceAbstract();

        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
    }
}
