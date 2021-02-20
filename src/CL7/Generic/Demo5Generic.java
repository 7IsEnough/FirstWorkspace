package CL7.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Promise
 * @create 2019-08-01-21:10
 */
public class Demo5Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

//        ArrayList<?> list03 = new ArrayList<?>();//无法在定义中使用通配符，只能在参数中使用
    }
    /*
    *定义一个方法，能遍历所有类型的ArrayList集合
    * 这时候我们不知道ArrayList集合使用什么数据类型，可以使用泛型的通配符?来接收数据类型
    * 注意：泛型没有继承概念
    */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            //it.next()方法，取出的元素是Object，可以接收任意的数据类型
            Object o = it.next();
            System.out.println(o);
        }
    }
}
