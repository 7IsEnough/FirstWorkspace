package CL7.Object;

import java.util.Objects;

/**
 * @author Promise
 * @create 2019-07-30-9:48
 */
public class Demo3Objects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";
//        boolean b = s1.equals(s2); //空指针异常
        //Objects.equals(s1,s2)可以防止空指针异常
        boolean b = Objects.equals(s1,s2);
        System.out.println(b);

    }
}
