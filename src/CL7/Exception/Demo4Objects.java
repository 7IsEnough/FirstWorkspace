package CL7.Exception;

import java.util.Objects;

/**
 * @author Promise
 * @create 2019-08-08-10:38
 */
public class Demo4Objects {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        //对传递过来的参数进行合法性判断，判断是否为null
//        if(obj == null){
//            throw new NullPointerException("传递的对象的值为null");
//        }
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象的值为null");
    }
}
