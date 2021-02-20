package CL7.InnerClass.InnerClass2;

/**
 * @author Promise
 * @create 2019-07-29-15:04
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        //使用匿名内部类，但不是匿名对象，对象名叫objA
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法,111A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法,222A");
            }
        };
        objA.method1();
        objA.method2();
        System.out.println("=============");

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法,111B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法,222B");
            }
        }.method1();
        //因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法,111B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法,222B");
            }
        }.method2();
    }
}
