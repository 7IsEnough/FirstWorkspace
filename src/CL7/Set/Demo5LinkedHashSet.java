package CL7.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author Promise
 * @create 2019-08-03-22:21
 */
public class Demo5LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);//无序，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked);//有序，不允许重复


    }
}
