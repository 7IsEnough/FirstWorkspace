package CL7.MethodReference.ArrayMethodReference;

import java.util.Arrays;

/**
 * @author Promise
 * @create 2019-08-23-10:33
 * 数组的构造器应用
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr1 = createArray(10, (int length) -> {
            return new int[length];
        });
        System.out.println(arr1.length);

        int[] arr2 = createArray(10, int[]::new);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);
    }
    //定义一个方法，方法的参数传递数组的长度和ArrayBuilder接口
    //方法内部根据传递的长度使用ArrayBuilder中的方法创建数组并返回
    public static int[] createArray(int length,ArrayBulider ab){
        return ab.builderArray(length);
    }

}
