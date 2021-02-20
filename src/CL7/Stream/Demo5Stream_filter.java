package CL7.Stream;

import java.util.stream.Stream;

/**
 * @author Promise
 * @create 2019-08-22-18:47
 */
public class Demo5Stream_filter {
    public static void main(String[] args) {
        //创建Stream流
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        //对元素进行过滤
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        //遍历Stream1流
        stream1.forEach((String name)->{
            System.out.println(name);
        });

    }
}
