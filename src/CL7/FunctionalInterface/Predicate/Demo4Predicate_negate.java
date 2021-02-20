package CL7.FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @author Promise
 * @create 2019-08-22-13:38
 */
public class Demo4Predicate_negate {
    public static void main(String[] args) {
        String s = "abcd";
        boolean b = checkString(s, (String str) -> {
                    return str.length() > 5;
                });
        System.out.println(b);
    }
    //定义一个方法，方法的参数，传递一个字符串
    //传递一个Predicate接口，用于判断字符串长度
    public static boolean checkString(String s, Predicate<String> pre1){
//       return !pre1.test(s);
        return pre1.negate().test(s);
    }

}
