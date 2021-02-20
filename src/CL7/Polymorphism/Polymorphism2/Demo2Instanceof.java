package CL7.Polymorphism.Polymorphism2;

/**
 * @author Promise
 * @create 2019-07-25-20:57
 */
public class Demo2Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();//本来是一只猫
        animal.eat();

        //如果希望调用子类特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        //判断一下animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        giveMeAPet(new Dog());
    }
    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

}
