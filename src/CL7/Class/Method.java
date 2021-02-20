package CL7.Class;

/**
 * @author Promise
 * @create 2019-07-22-10:35
 * 封装（方法就是一种封装）
 */
public class Method {
    public static void main(String[] args) {
        int[] array = {5,15,25,20,100};
        int max = getMax(array);
        System.out.println("最大值："+max);

    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
