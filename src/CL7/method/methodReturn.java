package CL7.method;

/**
 * @author Promise
 * @create 2019-07-17-15:31
 */
public class methodReturn {
    public static void main(String[] args) {
        int sum = getSum(10,20);
        System.out.println("返回值是："+sum);
        System.out.println("============");

        printSum(100,200);
        System.out.println("============");

        System.out.println(getSum(2,3));//正确写法
        getSum(3,5);//正确写法，但返回值没有用到
        System.out.println("============");

        //System.out.println(printSum(2,3));  错误写法
        //int num2 = printSum(10,20);  错误写法
    }
    //有返回值的方法
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }
    //无返回值的方法
    public static void printSum(int a,int b){
        int result = a + b;
        System.out.println("结果是："+result);
    }
}
