package CL7.Set;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Promise
 * @create 2019-08-04-14:25
 */
public class Demo7Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");

        //public static<T> boolean addAll(Collecton<T> c,T...elements):往集合添加一些元素
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);

        //public static void shuffle(List<?> list)：打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
