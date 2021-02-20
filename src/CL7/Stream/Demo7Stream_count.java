package CL7.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Promise
 * @create 2019-08-22-19:09
 */
public class Demo7Stream_count {
    public static void main(String[] args) {
        //获取Stream流
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
