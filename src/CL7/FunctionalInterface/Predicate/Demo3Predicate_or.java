package CL7.FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @author Promise
 * @create 2019-08-22-13:34
 */
public class Demo3Predicate_or {
    public static void main(String[] args) {
        String s = "abcd";
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
    //两个条件必须满足一个即可
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
//       return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }
}
