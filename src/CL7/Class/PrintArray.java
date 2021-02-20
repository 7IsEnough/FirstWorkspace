package CL7.Class;

import java.util.Arrays;

/**
 * @author Promise
 * @create 2019-07-19-19:20
 * 区分面向对象与面向过程
 */
public class PrintArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //要求输出格式为：[10,20,30,40,50]
        //使用面向过程,每一个步骤细节都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                System.out.println(array[i]+"]");
            } else {
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("===============");
        //使用面向对象
        //找一个JDK给我提供好的Arrays类
        //其中有一个toString方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
