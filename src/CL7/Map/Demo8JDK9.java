package CL7.Map;

/**
 * @author Promise
 * @create 2019-08-07-13:58
 * JDK9的特性
 *
 */
public class Demo8JDK9 {
    public static void main(String[] args) {
//        List<String> list = List.of("a","b","a","c","d");//使用of方法后不允许修改集合
//        System.out.println(list);//[a,b,a,c,d]
//        list.add("w");//会抛出不支持操作异常

//        Set<String> set = Set.of("a","b","a","c","d");//由于存放了重复元素，会抛出非法参数异常
//        Set<String> set = Set.of("a","b","c","d");
//        set.add("w");//会抛出不支持操作异常

        //Map也不能存相同元素，会抛出非法参数异常
//       Map<String,Integer> map = Map.of("张三",18,"李四",19,"王五",20);
//        map.put("赵四",30);//会抛出不支持操作异常
    }
}
