package CL7.MethodReference.ArrayMethodReference;

/**
 * @author Promise
 * @create 2019-08-23-10:31
 * 定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBulider {
    //定义一个方法，创建int类型数组的方法，参数传递数组的长度，返回创建好的int数组
    public abstract int[] builderArray(int length);
}
