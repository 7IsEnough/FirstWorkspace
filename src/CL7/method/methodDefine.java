package CL7.method;

/**
 * @author Promise
 * @create 2019-07-17-14:42
 * 定义两个int数字相加的方法。三要素：
 * 返回值类型：int
 * 方法名称：sum
 * 参数列表：int a,int b
 */
public class methodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("===============");

        //打印调用
        System.out.println(sum(10,20));
        System.out.println("===============");

        //赋值调用
        int number = sum(15,25);
        System.out.println("变量的值："+number);
    }
    public static int sum(int a,int b){
        System.out.println("方法执行了");
        int result = a+b;
        return result;
    }
}
