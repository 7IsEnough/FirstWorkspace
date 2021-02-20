package CL7.Collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Promise
 * @create 2019-08-01-10:43
 */
public class Demo1Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
//        Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);//重写了toString方法  []
        /*
        * public boolean add(E e):  把给定的对象添加到当前集合中
        * 返回值是一个boolean值，一般都返回true，所以可以不用接收
        */
        boolean b1 = coll.add("明凯");
        System.out.println(coll);
        System.out.println("b1:"+b1);
        coll.add("明凯");
        coll.add("简自豪");
        coll.add("严君泽");
        coll.add("刘世宇");
        coll.add("李元浩");
        System.out.println(coll);

        /*
        *public boolean remove(E e):把给定的对象在当前集合中删除
        * 返回值是一个boolean值，集合中存在元素，删除元素，返回true
        *                      集合中不存在元素，删除失败，返回false
        */

        boolean b2 = coll.remove("李元浩");
        System.out.println("b2:"+b2);

        boolean b3 = coll.remove("史森明");
        System.out.println("b3:"+b3);
        System.out.println(coll);

        /*
        *public boolean contains(E e):判断当前集合中是否包含给定的对象
        * 包含返回true
        * 不包含返回false
        */

        boolean b4 = coll.contains("明凯");
        System.out.println("b4:"+b4);

        boolean b5 = coll.contains("刘志豪");
        System.out.println("b5:"+b5);

        //public boolean isEmpty()：判断当前集合是否为空，集合为空返回true，不为空返回false
        boolean b6 = coll.isEmpty();
        System.out.println("b6:"+b6);

        //public int size():返回集合中元素的个数
        int size = coll.size();
        System.out.println("size:"+size);

        //public Object[] toArray():把集合中的元素，存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //public void clear()：清空集合中所有的元素，但不是删除集合，集合还存在
        coll.clear();
        System.out.println(coll);


    }
}
