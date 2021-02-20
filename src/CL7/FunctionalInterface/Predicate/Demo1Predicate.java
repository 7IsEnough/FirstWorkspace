package CL7.FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @author Promise
 * @create 2019-08-22-12:58
 */
public class Demo1Predicate {
    public static void main(String[] args) {
        String s = "abcde";
        boolean b = checkString(s, (String str) -> {
            //对字符串进行判断，是否长度大于5
            return str.length() > 5;
        });
        System.out.println(b);
    }
    //定义一个方法，参数传递String类型的字符串,和一个Predicate接口，泛型使用String
    //使用Predicate中的方法test对字符串进行判断，并把判断的结果返回
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }
}
