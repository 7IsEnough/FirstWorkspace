package CL7.FunctionalInterface.Consumer;

import java.util.function.Consumer;

/**
 * @author Promise
 * @create 2019-08-22-10:21
 */
public class Demo2AndThen {
    public static void main(String[] args) {
        //调用方法，传递两个Lambda表达式
        method("Hello",(s)->System.out.println(s.toLowerCase()),//把字符串改为小写输出
                (s)->System.out.println(s.toUpperCase()));//把字符串改为大写输出
    }
    //定义一个方法，参数传递一个字符串和两个Consumer接口，泛型使用String
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        //先执行con1,再执行con2
        con1.andThen(con2).accept(s);
    }
}
