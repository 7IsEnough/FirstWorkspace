package CL7.Static;

/**
 * @author Promise
 * @create 2019-07-23-13:21
 */
public class StaticStudent {


    public static void main(String[] args) {
        Student.room = "101教室";
        Student one = new Student("明凯",26);
        System.out.println("one的姓名："+one.getName());
        System.out.println("one的年龄："+one.getAge());
        System.out.println("one的教室："+Student.room);
        System.out.println("=================");

        Student two = new Student("简自豪",23);
        System.out.println("two的姓名："+two.getName());
        System.out.println("two的年龄："+two.getAge());
        System.out.println("two的教室："+Student.room);
    }
}
