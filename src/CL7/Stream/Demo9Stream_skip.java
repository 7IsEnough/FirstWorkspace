package CL7.Stream;

import java.util.stream.Stream;

/**
 * @author Promise
 * @create 2019-08-22-19:27
 */
public class Demo9Stream_skip {
    public static void main(String[] args) {
        //获取Stream流
        String[] arr = {"美羊羊","喜羊羊","懒羊羊","灰太狼","红太狼"};
        Stream<String> stream = Stream.of(arr);
        //使用skip方法
        Stream<String> stream1 = stream.skip(3);
        //遍历stream1
        stream1.forEach((String str)->{
            System.out.println(str);
        });
    }
}
