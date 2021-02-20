package CL7.String.StringMethods;

/**
 * @author Promise
 * @create 2019-07-22-21:01
 * 字符串截取方法
 */
public class SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("===========");

        String str3 = str1.substring(4,7);
        System.out.println(str3);
        System.out.println("=============");

        //这种写法，字符串的内容并没有改变
        //下面是2个字符串："Hello","Java"
        //StrA保存的是地址值
        //本来地址是"Hello"字符串的地址值
        //后来变成了"Java"的地址值
        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);

    }
}
