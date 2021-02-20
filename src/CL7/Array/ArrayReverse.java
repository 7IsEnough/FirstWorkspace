package CL7.Array;

/**
 * @author Promise
 * @create 2019-07-19-18:44
 * 数组元素的反转
 * 要求不能使用新数组，就用原来的唯一一个数组。
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {7,3,4,2,6,7,2,0,8};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");

        for(int min = 0,max = array.length - 1 ; min < max ; min++ , max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
