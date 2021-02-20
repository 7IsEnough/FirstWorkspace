package CL7.FunctionalInterface.LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Promise
 * @create 2019-08-22-9:07
 */
public class Demo2Comparator {
    public static void main(String[] args) {
        String[] arr = {"aaa","b","ccccc","ddddddddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }
    //定义一个方法，方法的返回值类型使用函数式接口
    public static Comparator<String> getComparator(){
//        //方法的返回值类型是接口，可以返回匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //按照字符串降序排列
//                return o2.length()-o1.length();
//            }
//        };
        //返回Lambda表达式
        return (o1,o2)->o2.length()-o1.length();
    }
}
