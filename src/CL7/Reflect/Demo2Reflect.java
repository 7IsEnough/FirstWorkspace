package CL7.Reflect;

import java.lang.reflect.Field;

/**
 * @author Promise
 * @create 2019-08-23-13:52
 */
public class Demo2Reflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取Person的class对象
        Class personClass = Person.class;
        //1.获取成员变量
        Field[] fields = personClass.getFields();//获取所有public修饰的成员变量
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=============");
        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p,"明凯");
        System.out.println(p);
        System.out.println("=====================");
        Field[] declaredFields = personClass.getDeclaredFields();//获取所有的成员变量，不考虑修饰符
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field d = personClass.getDeclaredField("d");//会报权限异常
        //需要忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);


    }
}
