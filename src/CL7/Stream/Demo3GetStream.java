package CL7.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Promise
 * @create 2019-08-22-16:11
 */
public class Demo3GetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        //获取键，存储到一个set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

        //获取值
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //获取键值对(键与值的映射关系 entrySet)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //把数组转变为Stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);

        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] arr2 = {"a","bb","ccc"};
        Stream<String> stream8 = Stream.of(arr2);

    }
}
