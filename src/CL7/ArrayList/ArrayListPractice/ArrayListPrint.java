package CL7.ArrayList.ArrayListPractice;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-22-19:14
 * 定义以指定格式打印集合的方法
 * 格式参照：{元素@元素@元素}
 */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("明凯");
        list.add("简自豪");
        list.add("李青");
        list.add("希维尔");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i==list.size()-1){
                System.out.println(name+"}");
            }else{
                System.out.print(name+"@");
            }
        }
    }
}
