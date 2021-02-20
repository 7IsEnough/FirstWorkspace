package CL7.List;

import java.util.LinkedList;

/**
 * @author Promise
 * @create 2019-08-02-21:12
 */
public class Demo2LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }




    /*
    *public void addFirst(E e):将指定元素插入此链表的开头。
    * public void addLast(E e):将指定元素插入到此链表的结尾
    * public void push(E e):将元素推入此链表所表示的堆栈
    */
    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //public void addFirst(E e):将指定元素插入此链表的开头
//        linked.addFirst("www");
        linked.push("www"); //等效于addFirst(E e)
        System.out.println(linked);

        //public void addLast(E e):将指定元素添加到此链表的结尾。此方法等效于add()
        linked.addLast("com");
        System.out.println(linked);

    }

    /*
    *public E getFirst()：返回此链表的第一个元素
    * public E getLast()：返回此链表的最后一个元素
    */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

//        linked.clear();//如果在清空集合元素后，获取集合元素会抛出无元素异常

        //public Boolean isEmpty():如果链表不包含元素，则返回true
        if(!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }


    }

    /*
    *public E removeFirst()：移除并返回此链表的第一个元素
    * public E removeLast()：移除并返回此链表的最后一个元素
    * public E pop()：从此链表所表示的堆栈处弹出一个元素  此方法相当于removeFirst()
    */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

//        String first = linked.removeFirst();
        String first = linked.pop();
        System.out.println("被移除的第一个元素："+first);
        String last = linked.removeLast();
        System.out.println("被移除的最后一个元素："+last);
        System.out.println(linked);
    }
}
