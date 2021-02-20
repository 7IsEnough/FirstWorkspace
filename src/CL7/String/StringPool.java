package CL7.String;

/**
 * @author Promise
 * @create 2019-07-22-20:12
 * 了解字符串常量池
 */
public class StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str3==str2);
    }
}
