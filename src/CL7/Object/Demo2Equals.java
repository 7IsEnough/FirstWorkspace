package CL7.Object;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-29-20:53
 */
public class Demo2Equals {
    public static void main(String[] args) {
        Person p1 = new Person("明凯",26);
        Person p2 = new Person("简自豪",23);
        Person p3 = new Person("简自豪",23);
        System.out.println("p1："+p1);
        System.out.println("p2："+p2);
//        p1 = p2;

        ArrayList<String> list = new ArrayList<>();

//        boolean b = p3.equals(p2);
        boolean b = p1.equals(list);//错误，会出现类型转换异常
        System.out.println(b);



    }
}
