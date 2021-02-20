package CL7.FunctionalInterface;

/**
 * @author Promise
 * @create 2019-08-21-21:24
 */
public class Demo {
    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //调用show方法，方法的参数是一个接口，可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        //调用show方法，方法的参数是函数式接口,可以使用Lambda表达式
        show(()-> System.out.println("使用Lambda表达式重写接口中的抽象方法"));

    }
    //定义一个方法，参数使用函数式接口
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }
}
