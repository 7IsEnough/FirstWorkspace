package CL7.Exception;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-08-08-20:48
 */
public class Demo8Exception {
    public static void main(String[] args) {
        //1.多个异常分别处理
//        try {
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
////            System.out.println(e);
//        }
//
//        try {
//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 3
//        }catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
////            System.out.println(e);
//        }

        //2.多个异常一次捕获，多次处理
//        try {
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);
//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 3
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }

        //3.多个异常一次捕获，一次处理
//        try {
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);
//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 3
//        }catch (Exception e) {
//            System.out.println(e);
//        }
        //运行时异常被抛出可以不处理，既不捕获也不声明抛出
        //默认给(JVM)虚拟机处理，终止程序，什么时候不抛出运行时异常了，再来继续执行程序
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 3



        System.out.println("后续代码");
    }
}
