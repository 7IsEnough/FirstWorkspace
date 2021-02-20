package CL7.Array;

/**
 * @author Promise
 * @create 2019-07-19-19:01
 * 将数组作为方法参数
 */
public class ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        printArray(array);//传递进去的就是array当中保存的地址值
        System.out.println("=========");
    }

    public static void printArray(int[] array){//方法受到的参数是数组array的地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
