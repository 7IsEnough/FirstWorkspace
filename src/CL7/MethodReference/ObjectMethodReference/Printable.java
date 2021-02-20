package CL7.MethodReference.ObjectMethodReference;

/**
 * @author Promise
 * @create 2019-08-22-20:27
 * 定义一个打印的函数式接口
 */
@FunctionalInterface
public interface Printable {
    //打印字符串的抽象方法
    public abstract void print(String s);
}
