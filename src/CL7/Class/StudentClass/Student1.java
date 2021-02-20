package CL7.Class.StudentClass;

/**
 * @author Promise
 * @create 2019-07-22-13:30
 */
public class Student1 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("明凯");
        stu1.setAge(26);
        System.out.println("姓名："+stu1.getName()+" 年龄："+stu1.getAge());
        System.out.println("==============");

        Student stu2 = new Student("简自豪",23);
        System.out.println("姓名："+stu2.getName()+" 年龄："+stu2.getAge());
        stu2.setAge(25);
        System.out.println("姓名："+stu2.getName()+" 年龄："+stu2.getAge());
    }
}
