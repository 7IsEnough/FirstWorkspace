package CL7.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Promise
 * @create 2019-08-06-19:08
 */
public class Demo2KeySet {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("明凯",168);
        map.put("简自豪",165);
        map.put("严君泽",178);

        //1.使用Map集合中的方法keySet()，把Map集合所有的key取出来，存储到一个set集合中
        Set<String> set = map.keySet();
        //2.遍历set集合，获取Map集合中的每一个key
        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            //3.通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("==============");
        //使用增强for循环遍历Set集合
//        for (String s : set) {
        for (String s : map.keySet()) {
            //3.通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(s);
            System.out.println(s+"="+value);
        }
    }
}
