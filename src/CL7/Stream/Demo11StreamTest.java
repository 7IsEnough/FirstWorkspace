package CL7.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Promise
 * @create 2019-08-22-19:39
 */
public class Demo11StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        //只需要三个字的成员姓名
        Stream<String> stream = one.stream();
        Stream<String> stream1 = stream.filter((String str) -> {
            return str.length() == 3;
        });
        //只要前3人
        Stream<String> stream2 = stream1.limit(3);

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        //只要姓张的
        Stream<String> stream3 = two.stream();
        Stream<String> stream4 = stream3.filter((String str) -> {
            return str.startsWith("张");
        });
        //不要前2个人
        Stream<String> stream5 = stream4.skip(2);


        //将两个队伍合并为一个队伍
        Stream<String> stream6 = Stream.concat(stream2, stream5);

        //根据姓名创建Person对象
        Stream<Person> stream7 = stream6.map((String name) -> {
            return new Person(name);
        });


        //根据姓名创建Person对象，存储到一个新集合中
        ArrayList<Person> list = new ArrayList<>();
        stream7.forEach((Person name)->{
            list.add(name);
        });
        //打印新集合
        for (Person person : list) {
            System.out.println(person);
        }




    }
}
