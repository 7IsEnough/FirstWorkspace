package CL7.Static;

/**
 * @author Promise
 * @create 2019-07-23-10:38
 */
public class StaticField {
    public static void main(String[] args) {
        Student one = new Student("明凯",26);
        one.room = "101教室";
        System.out.println("姓名："+one.getName()
                +" 年龄："+one.getAge() + ",教室："+one.room
                +"，学号："+one.getId());
        Student two = new Student("简自豪",23);
        System.out.println("姓名："+two.getName()
                +" 年龄："+two.getAge() + ",教室："+two.room
                +"，学号："+two.getId());



    }
}
