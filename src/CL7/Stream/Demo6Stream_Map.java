package CL7.Stream;

import java.util.stream.Stream;

/**
 * @author Promise
 * @create 2019-08-22-19:03
 */
public class Demo6Stream_Map {
    public static void main(String[] args) {
        //获取一个String类型的流
        Stream<String> stream = Stream.of("1","2","3","4");
        //使用map方法，将字符串类型的整数，转换(映射)为Integer类型的整数
        Stream<Integer> stream1 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        //遍历Stream1
        stream1.forEach((Integer i)->{
            System.out.println(i);
        });
    }
}
