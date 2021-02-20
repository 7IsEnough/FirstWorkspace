package CL7.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Promise
 * @create 2019-08-22-14:22
 */
public class Demo2Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");


        //过滤元素，只要以张开头的元素
        //过滤元素，只要姓名长度为3的人
        //遍历集合
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
