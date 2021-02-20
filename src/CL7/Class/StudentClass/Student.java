package CL7.Class.StudentClass;

/**
 * @author Promise
 * @create 2019-07-22-13:25
 * 构造一个标准的学生类
 * 标准类也被称作（Java Bean）
 * 代码生成Code -> Generate
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
