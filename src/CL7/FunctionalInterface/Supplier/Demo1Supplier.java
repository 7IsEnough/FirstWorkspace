package CL7.FunctionalInterface.Supplier;

import java.util.function.Supplier;

/**
 * @author Promise
 * @create 2019-08-22-9:28
 */
public class Demo1Supplier {
    public static void main(String[] args) {
        //调用方法，参数可以使用Lambda表达式
        String s = getString(() -> "明凯");
        System.out.println(s);
    }
    //定义一个方法，参数传递Supplier<T>接口，泛型指定String，执行get方法后返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }
}
