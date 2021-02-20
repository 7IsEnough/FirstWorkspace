package CL7.String.StringMethods;

/**
 * @author Promise
 * @create 2019-07-22-20:44
 * String当中与获取相关的常用方法
 */
public class StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "sdfasdfasdfasdfasdfasdfas".length();
        System.out.println("字符串长度为："+length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=============");

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+ch);

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果根本没有，返回-1
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是："+index);
        System.out.println("HelloWorld".indexOf("abc"));
    }
}
