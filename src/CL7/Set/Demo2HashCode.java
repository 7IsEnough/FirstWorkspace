package CL7.Set;

/**
 * @author Promise
 * @create 2019-08-03-10:58
 */
public class Demo2HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);


        /*
        *toString方法的源码：
        * return getClass().getName() + "@" + Integer.toHexString(hashCode());
        */
        System.out.println(p1);//即为上述哈希值的16进制形式
        System.out.println(p2);
        System.out.println(p1==p2);

        /*
        *String类的哈希值
        *       String类重写Object类的hashCode方法
        */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());


    }
}
