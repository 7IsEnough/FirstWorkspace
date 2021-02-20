package CL7.Class.newClass;

/**
 * @author Promise
 * @create 2019-07-22-12:54
 */
public class Student1 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("明凯",26);
        System.out.println("姓名："+stu2.getName()+" 年龄："+stu2.getAge());
        //如果需要改变对象当中的成员变量数据内容，仍然还需要使用set方法
        stu2.setAge(25);//改变年龄
        System.out.println("姓名："+stu2.getName()+" 年龄："+stu2.getAge());
    }
}
