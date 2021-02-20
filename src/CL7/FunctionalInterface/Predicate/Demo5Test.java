package CL7.FunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author Promise
 * @create 2019-08-22-13:46
 */
public class Demo5Test {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女",};
        ArrayList<String> list = filter(arr, (String str) -> {
                    String[] split = str.split(",");
                    return split[0].length() == 4;
                },
                (String str) -> {
                    String[] split = str.split(",");
                    return split[1].equals("女");
                });
        for (String s : list) {
            System.out.println(s);
        }
    }
    //定义一个方法，参数传递一个包含人员信息的数组，两个Predicate接口
    //将满足条件的信息存到ArrayList集合中并返回
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if(b){
                list.add(s);
            }
        }
        return list;
    }

}
