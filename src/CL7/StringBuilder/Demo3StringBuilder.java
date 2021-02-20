package CL7.StringBuilder;

/**
 * @author Promise
 * @create 2019-07-31-16:29
 */
public class Demo3StringBuilder {
    public static void main(String[] args) {
        //String -> StringBuilder
        String str = "Hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append("World");
        System.out.println("bu:"+bu);

        //StringBuilder -> String
        String s = bu.toString();
        System.out.println("s:"+s);
    }
}
