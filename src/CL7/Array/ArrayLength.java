package CL7.Array;

/**
 * @author Promise
 * @create 2019-07-19-16:34
 * 获取数组的长度
 */
public class ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10,2,2,2,2,2,2,2,2,7};
        int len = arrayB.length;
        System.out.println("arrayB的长度为："+len);
        System.out.println("=============");
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
