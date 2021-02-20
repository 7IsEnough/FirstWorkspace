package CL7.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Promise
 * @create 2019-08-02-15:49
 */
public class Demo1List {
    public static void main(String[] args) {
        //创建一个list集合，多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//不是地址，重写了toString方法

        //public void add(int index,E element):将指定的元素，添加到该集合中的指定位置上。
        //在c和d之间添加一个itheima
        list.add(3,"itheima");
        System.out.println(list);

        //public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素："+removeE);
        System.out.println(list);

        //public E set(int index,E element):用指定元素替换集合中指定位置的元素
        // 返回值为更新前的元素。(把最后一个a，替换为A)
        String setE = list.set(4,"A");
        System.out.println("被替换的元素："+setE);
        System.out.println(list);

        //list集合遍历有3种方式
        //使用普通for循环
        for (int i = 0; i < list.size(); i++) {
            //public E get(int index)：返回集合中指定位置的元素
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("===========");

        //使用迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("===============");

        //使用增强for循环
        for(String s:list){
            System.out.println(s);
        }

//        String r = list.get(5);//索引越界异常
//        System.out.println(r);
    }
}
