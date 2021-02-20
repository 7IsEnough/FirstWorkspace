package CL7.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Promise
 * @create 2019-08-07-10:47
 */
public class Demo5LinkedHashmap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);//key不允许重复，无序

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("a","d");
        System.out.println(linked);//key不允许重复，有序
    }
}
