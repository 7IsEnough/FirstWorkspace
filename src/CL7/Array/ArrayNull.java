package CL7.Array;

/**
 * @author Promise
 * @create 2019-07-19-16:26
 * 数组空指针异常
 */
public class ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        //array = new int[3];
        System.out.println(array[0]);
    }
}
