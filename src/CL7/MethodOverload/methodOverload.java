package CL7.MethodOverload;

/**
 * @author Promise
 * @create 2019-07-19-9:24
 */
public class methodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }
    public static int sum(int a,double b){
        System.out.println("有2个参数的方法执行！");
        return (int)(a + b);
    }
    public static int sum(double a,int b){
        System.out.println("有2个参数的方法执行！");
        return (int)(a + b);
    }
    public static int sum(int a,int b){
        System.out.println("有2个参数的方法执行！");
        return a + b;
    }
    public static int sum(double a,double b){
        System.out.println("有2个参数的方法执行！");
        return (int)(a + b);
    }
    public static int sum(int a,int b,int c){
        System.out.println("有3个参数的方法执行！");
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        System.out.println("有4个参数的方法执行！");
        return a + b + c + d;
    }
}
