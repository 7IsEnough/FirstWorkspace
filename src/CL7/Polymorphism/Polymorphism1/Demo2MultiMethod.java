package CL7.Polymorphism.Polymorphism1;

/**
 * @author Promise
 * @create 2019-07-25-10:47
 */
public class Demo2MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态

        obj.method();//父子都有，优先用子
        obj.methodFu();//子类没有，父类有，向上找到父类

        //编译看左边，左边是Fu,Fu当中没有methodZi方法，所以编译报错
//        obj.methodZi();//错误写法
    }
}
