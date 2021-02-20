package CL7.Polymorphism.Polymorphism2;

/**
 * @author Promise
 * @create 2019-07-25-20:43
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃SHIT");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
