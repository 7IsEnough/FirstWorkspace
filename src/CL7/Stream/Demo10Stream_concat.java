package CL7.Stream;

import java.util.stream.Stream;

/**
 * @author Promise
 * @create 2019-08-22-19:29
 */
public class Demo10Stream_concat {
    public static void main(String[] args) {
        //创建Stream流
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        //获取Stream流
        String[] arr = {"美羊羊","喜羊羊","懒羊羊","灰太狼","红太狼"};
        Stream<String> stream2 = Stream.of(arr);
        //合并以上两个流
        Stream<String> concat = Stream.concat(stream1, stream2);
        //遍历concat
        concat.forEach((String name)->{
            System.out.println(name);
        });
    }
}
