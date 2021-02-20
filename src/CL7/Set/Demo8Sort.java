package CL7.Set;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Promise
 * @create 2019-08-04-14:35
 */
public class Demo8Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
        Collections.sort(list01);//默认为升序
        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);

        Collections.sort(list02);
        System.out.println(list02);


        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("明凯",26));
        list03.add(new Person("简自豪",23));
        list03.add(new Person("严君泽",24));
        System.out.println(list03);

        Collections.sort(list03);
        System.out.println(list03);

    }
}
