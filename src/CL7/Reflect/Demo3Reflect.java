package CL7.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Promise
 * @create 2019-08-23-13:52
 */
public class Demo3Reflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //获取Person的class对象
        Class personClass = Person.class;
        //获取构造方法
        Constructor constructor = personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("明凯", 26);
        System.out.println(person);
        System.out.println("==================");

        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        //直接调用newInstance方法创建空参对象
        Object o = personClass.newInstance();
        System.out.println(o);


    }
}
