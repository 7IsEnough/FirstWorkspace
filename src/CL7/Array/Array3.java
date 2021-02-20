package CL7.Array;

/**
 * @author Promise
 * @create 2019-07-19-16:54
 * 遍历数组
 */
public class Array3 {
    public static void main(String[] args) {
        int[] array = {15,25,30,40,50,60};

        //原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println("==========");
        
        //使用循环
        for (int i = 0; i < 6 ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
