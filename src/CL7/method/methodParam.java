package CL7.method;

/**
 * @author Promise
 * @create 2019-07-17-15:23
 */
public class methodParam {
    public static void main(String[] args) {
        method1(10,20);
        System.out.println("=========");
        method2();
    }
    //有参数方法
    public static void method1(int a,int b){
        int result = a * b;
        System.out.println("结果是："+result);
    }

    //无参数方法
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,World"+i);
        }
    }
}
