package CL7.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Promise
 * @create 2019-08-03-10:51
 */
public class Demo1Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add方法往集合中添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            System.out.println(n);
        }
        System.out.println("============");
        //使用增强for遍历
        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
