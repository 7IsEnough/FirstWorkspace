package CL7.Polymorphism.Polymorphism1;

/**
 * @author Promise
 * @create 2019-07-24-21:44
 */
public class Demo1MultiField {
    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);//错误写法  成员变量无法重写
        System.out.println("================");
        //子类没有覆盖重写，就是父：10
        //子类如果覆盖重写：就是子：20
        obj.showNum();
    }
}
