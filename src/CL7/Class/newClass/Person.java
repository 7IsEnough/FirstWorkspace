package CL7.Class.newClass;

/**
 * @author Promise
 * @create 2019-07-22-10:55
 */
public class Person {
    String name;  //成员变量（自己的名字）


    //参数who是对方的名字
    //成员变量name是自己的名字
    public void sayHello(String name){
        System.out.println(name+",你好，我是"+this.name);
    }
}
