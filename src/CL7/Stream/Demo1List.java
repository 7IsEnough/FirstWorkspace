package CL7.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Promise
 * @create 2019-08-22-14:11
 */
public class Demo1List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //过滤元素，只要以张开头的元素
        List<String> listA = new ArrayList<String>();
        for (String s : list) {
            if(s.startsWith("张")){
                listA.add(s);
            }
        }

        //过滤元素，只要姓名长度为3的人
        List<String> listB = new ArrayList<String>();
        for (String s : listA) {
            if(s.length()==3){
                listB.add(s);
            }
        }

        //遍历集合
        for (String s : listB) {
            System.out.println(s);
        }
    }

}
