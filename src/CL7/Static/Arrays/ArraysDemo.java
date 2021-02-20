package CL7.Static.Arrays;

import java.util.Arrays;

/**
 * @author Promise
 * @create 2019-07-23-13:54
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
