package CL7.String.StringMethods;

/**
 * @author Promise
 * @create 2019-07-22-20:30
 * 字符串内容比较
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4 = null;
        System.out.println("abc".equals(str4)); //推荐写法：false
//        System.out.println(str4.equals("abc")); //不推荐写法，会报错,空指针异常
        System.out.println("===============");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));



    }
}
