package CL7.Collection.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Promise
 * @create 2019-08-01-15:11
 */
public class Demo1Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //向集合中添加元素
        coll.add("明凯");
        coll.add("简自豪");
        coll.add("严君泽");
        coll.add("刘世宇");
        coll.add("李元浩");

        //使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
        // 注意：Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，
        // 集合是什么泛型，迭代器就是什么泛型

        //多态  接口              实现类对象
        Iterator<String> it = coll.iterator();

        /*
        *发现使用迭代器取出集合中元素的代码，是一个重复的过程
        * 所以使用循环优化
        * 如果不知道集合中元素的数量，使用while循环，知道用for循环
        * while循环结束的条件：hasNext方法返回false
        */

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("==============");


        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String s = it2.next();
            System.out.println(s);
        }


//        //使用Iterator接口中的方法hasNext判断还有没有下一个元素
//        boolean b = it.hasNext();
//        System.out.println(b);
//
//        //使用Iterator接口中的方法next取出集合中的下一个元素
//        String s = it.next();
//        System.out.println(s);
//
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);//没有元素，返回false
//        s = it.next();
//        System.out.println(s);//没有元素，再取出元素会抛出(没有元素)异常

    }
}
