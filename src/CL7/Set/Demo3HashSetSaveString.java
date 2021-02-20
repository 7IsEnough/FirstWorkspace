package CL7.Set;

import java.util.HashSet;

/**
 * @author Promise
 * @create 2019-08-03-11:37
 * Set集合不允许存储重复元素的原理
 */
public class Demo3HashSetSaveString {

    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);

    }


}
