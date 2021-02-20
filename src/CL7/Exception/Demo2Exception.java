package CL7.Exception;

/**
 * @author Promise
 * @create 2019-08-07-16:50
 * 异常的产生过程解析(分析异常是怎么产生的，如何处理异常)
 */
public class Demo2Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int e =getElement(arr,0);
//        int e =getElement(arr,3);  索引越界异常
        System.out.println(e);
    }
    /*
    *   定义一个方法，获取数组指定索引处的元素
    *   参数：
    *       int[] arr
    *       int index
    */
    public static int getElement(int[] arr,int index){
        int ele = arr[index];
        return ele;
    }
}
