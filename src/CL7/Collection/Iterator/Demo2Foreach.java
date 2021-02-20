package CL7.Collection.Iterator;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-08-01-15:54
 */
public class Demo2Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }



    //使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
    }
    //使用增强for循环遍历集合
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s:list){
            System.out.println(s);
        }
    }
}
