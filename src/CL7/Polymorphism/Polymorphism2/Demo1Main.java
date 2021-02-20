package CL7.Polymorphism.Polymorphism2;

/**
 * @author Promise
 * @create 2019-07-25-15:24
 */
public class Demo1Main {
    public static void main(String[] args) {
        //对象的向上转型，即：父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
//        animal.catchMouse();//错误写法

        //向下转型，进行“还原”动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //下面是错误的向下转型
        //本来new的时候是一只猫，现在非要当做狗
        //编译不会报错，但是运行会出现异常：类转换异常
        Dog dog = (Dog) animal;


    }
}
