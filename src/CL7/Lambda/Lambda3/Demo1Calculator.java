package CL7.Lambda.Lambda3;

/**
 * @author Promise
 * @create 2019-08-14-15:19
 */
public class Demo1Calculator {
    public static void main(String[] args) {
        //调用invokeCalc方法，方法的参数是一个接口，可以使用匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //使用Lambda表达式简化匿名内部类的书写
        invokeCalc(120,130,(int a,int b)->{
            return a+b;
        });

        //省略Lambda表达式
        invokeCalc(120,130,(a, b)->a+b);
    }
    /*
    * 定义一个方法
    * 参数传递两个int类型的整数
    * 参数传递Calculator接口
    * 方法内部调用Calculator中的方法calc计算两个整数的和
    */
    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
