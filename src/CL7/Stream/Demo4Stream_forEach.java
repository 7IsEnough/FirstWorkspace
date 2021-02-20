package CL7.Stream;

import java.util.stream.Stream;

/**
 * @author Promise
 * @create 2019-08-22-16:44
 */
public class Demo4Stream_forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用forEach方法
        stream.forEach((String name)->{
            System.out.println(name);
        });
    }
}
