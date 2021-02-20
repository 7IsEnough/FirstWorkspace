package CL7.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Promise
 * @create 2019-08-04-16:55
 */
public class Demo1Map {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();


    }




    /*
    *public V put(K key,V value);  把指定的键与指定的值添加到Map集合中
    * 返回值：V
    *       存储键值对的时候，key不重复，返回值v是null
    *       存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值
    */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("明凯", "伊芙琳1");
        System.out.println("v1:"+v1);

        String v2 = map.put("明凯", "伊芙琳2");
        System.out.println("v2:"+v2);

        System.out.println(map);

        map.put("简自豪","薇恩");
        map.put("严君泽","奥恩");
        map.put("刘志豪","奥恩");
        System.out.println(map);
    }

    /*
    *public V remove(Object key)： 把指定的键，所对应的键值对元素，在Map集合中删除
    * 返回被删除元素的值(Value)
    *           返回值：V
    *           key存在，v返回被删除的值
    *           key不存在，v返回null
    */
    private static void show02() {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("明凯",168);
        map.put("简自豪",165);
        map.put("严君泽",178);
        System.out.println(map);
        Integer v1 = map.remove("严君泽");
        System.out.println("v1："+v1);
        System.out.println(map);

        Integer v2 = map.remove("刘世宇");
        System.out.println("v2："+v2);
        System.out.println(map);
    }


    /*
    *public V get(Object key)根据指定的值，在Map集合中获取对应的值
    * 返回值：V
    *   key存在，v返回被删除的值
    *   key不存在，v返回null
    */
    private static void show03() {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("明凯",168);
        map.put("简自豪",165);
        map.put("严君泽",178);

        Integer v1 = map.get("明凯");
        System.out.println("v1:"+v1);

        Integer v2 = map.get("刘世宇");
        System.out.println("v2:"+v2);

    }

    /*
    *   boolean containsKey(Object key)判断集合中是否包含指定的键
    *   包含返回true，不包含返回false
    */
    private static void show04() {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("明凯",168);
        map.put("简自豪",165);
        map.put("严君泽",178);

        boolean b1 = map.containsKey("明凯");
        System.out.println("b1:"+b1);

        boolean b2 = map.containsKey("李元浩");
        System.out.println("b2:"+b2);

    }

}
