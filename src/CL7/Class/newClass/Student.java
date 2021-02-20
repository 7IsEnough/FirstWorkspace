package CL7.Class.newClass;

/**
 * @author Promise
 * @create 2019-07-22-12:51
 * 构造方法
 */
public class Student {
    //成员变量
    private String name;
    private int age;

    public Student(){
        System.out.println("无参构造方法执行了");
    }

    public Student(String name , int age){
        System.out.println("全参构造方法执行了");
        this.name = name;
        this.age = age;
    }


    //get set方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
