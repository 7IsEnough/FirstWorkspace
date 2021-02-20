package CL7.Polymorphism.Polymorphism2;

/**
 * @author Promise
 * @create 2019-07-25-15:10
 */
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
