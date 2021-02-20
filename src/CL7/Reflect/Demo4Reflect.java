package CL7.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Promise
 * @create 2019-08-23-13:52
 */
public class Demo4Reflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //获取Person的class对象
        Class personClass = Person.class;
        //获取指定名称成员方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        //获取指定名称带参数的成员方法
        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(p,"饭");
        System.out.println("===================");

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        //获取类名
        String className = personClass.getName();
        System.out.println(className);


    }
}
