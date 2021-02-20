package CL7.Class;

/**
 * @author Promise
 * @create 2019-07-19-20:39
 * 创建学生类的对象
 */
public class Student2 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "明凯";
        stu.age = 26;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("==============");

        stu.eat();
        stu.sleep();
        stu.study();



    }


}
