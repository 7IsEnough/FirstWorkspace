package CL7.Set;

import java.util.HashSet;

/**
 * @author Promise
 * @create 2019-08-03-11:55
 */
public class Demo4HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("明凯",26);
        Person p2 = new Person("明凯",26);
        Person p3 = new Person("明凯",27);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
