package CL7.Class;

/**
 * @author Promise
 * @create 2019-07-19-20:28
 * 定义一个学生类，有两个组成部分；
 * 属性（是什么）
 *      姓名
 *      年龄
 * 行为（能做什么）
 *       吃饭
 *       睡觉
 *       学习
 *
 * 对应到Java类当中
 *
 * 成员变量（属性）
 *       String name;//姓名
 *       int age;//年龄
 * 成员方法（行为）
 *        Public void eat() {} //吃饭
 *        Public void sleep() {} //睡觉
 *        Public void study() {} //学习
 */
public class Student {
    //成员变量
    String name; //姓名
    int age;  //年龄

    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
