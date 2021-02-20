package CL7.IOStream.ObjectStream;

import java.io.Serializable;

/**
 * @author Promise
 * @create 2019-08-21-10:57
 */
//序列化和反序列化的时候，会抛出 没有序列化异常
//类通过实现Serializable接口以启动其序列化功能。
//未实现此接口无法使其任何状态序列化或反序列化。
//Serializable接口也叫标记型接口
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
