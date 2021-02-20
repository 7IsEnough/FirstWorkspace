package CL7.FunctionalInterface.Consumer;

import java.util.function.Consumer;

/**
 * @author Promise
 * @create 2019-08-22-9:49
 */
public class Demo1Consumer {
    public static void main(String[] args) {

        method("明凯",(name)->{
//            System.out.println(name)
       String rename = new StringBuffer(name).reverse().toString();
            System.out.println(rename);
    });
    }
    //定义一个方法，参数传递字符串的姓名，Consumer接口，泛型使用String
    //使用Consumer接口消费字符串的姓名
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }
}
