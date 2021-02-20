package CL7.Polymorphism;

/**
 * @author Promise
 * @create 2019-07-24-21:13
 */
public class Demo1Multi {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}
