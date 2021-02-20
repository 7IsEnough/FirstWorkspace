package CL7.FunctionalInterface.Supplier;

import java.util.function.Supplier;

/**
 * @author Promise
 * @create 2019-08-22-9:29
 */
public class Demo2Test {
    public static void main(String[] args) {
        int[] arr = {100,0,-50,88,99,33,-30};
//        int max = getMax(new Supplier<Integer>() {
//            @Override
//            public Integer get() {
////                获取数组最大值
//                int max = arr[0];
//                for (int i : arr) {
//                    if (max < i) {
//                        max = i;
//                    }
//                }
//                return max;
//            }
//        });
        int max = getMax(() -> {
                    //获取数组最大值
                    int temp = arr[0];
                    for (int i : arr) {
                        if (temp < i) {
                            temp = i;
                        }
                    }
                    return temp;
                }
        );
        System.out.println(max);
    }
    //定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口
    //泛型使用Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
