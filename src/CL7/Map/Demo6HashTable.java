package CL7.Map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Promise
 * @create 2019-08-07-11:00
 */
public class Demo6HashTable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);

        Hashtable<String,String> table = new Hashtable<>();
//        table.put(null,"a");//空指针异常
//        table.put("b",null);//空指针异常
//        table.put(null,null);//空指针异常
    }
}
