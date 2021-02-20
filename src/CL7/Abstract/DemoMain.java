package CL7.Abstract;

/**
 * @author Promise
 * @create 2019-07-24-9:59
 */
public class DemoMain {
    public static void main(String[] args) {
//        Animal animal = new Animal(); //错误写法！不能直接创建抽象类对象
        Cat cat = new Cat();
        cat.eat();
    }
}
