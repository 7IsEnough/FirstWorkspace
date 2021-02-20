package CL7.Array;

/**
 * @author Promise
 * @create 2019-07-19-16:18
 * 数组索引越界
 */
public class ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15,25,35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //错误写法，并不存在3号元素，所以发生异常
        System.out.println(array[3]);
    }
}
