package CL7.FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @author Promise
 * @create 2019-08-22-13:22
 */
public class Demo2Predicate_and {
    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkString(s, (String str) -> {
                    return str.length() > 5;
                },
                (String str) -> {
                    return str.contains("a");
                }
        );
        System.out.println(b);
    }
    //定义一个方法，方法的参数，传递一个字符串
    //传递两个Predicate接口，一个用于判断字符串长度，一个用于判断是否包含a
    //两个条件必须同时满足
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
//       return pre1.test(s) && pre2.test(s);
       return pre1.and(pre2).test(s);
    }
}
