package CL7.StringBuilder;

/**
 * @author Promise
 * @create 2019-07-31-16:06
 */
public class Demo1StringBuilder {
    public static void main(String[] args) {
        //空参数构造方法,默认为""
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);

        //带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);
    }
}
