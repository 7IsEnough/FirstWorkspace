package CL7.Array;

/**
 * @author Promise
 * @create 2019-07-19-10:43
 * 动态初始化访问数组元素
 */
public class ArrayUse2 {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println("===========");
        array[1] = 123;
        System.out.println(array[0]+" "+array[1]);
    }
}
