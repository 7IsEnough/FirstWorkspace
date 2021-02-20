package CL7.MethodReference.StaticMethodReference;

/**
 * @author Promise
 * @create 2019-08-23-9:03
 */
@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法，传递一个整数，对整数进行绝对值计算并返回
   public abstract int calsAbs(int number);
}
