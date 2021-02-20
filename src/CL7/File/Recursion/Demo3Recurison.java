package CL7.File.Recursion;

/**
 * @author Promise
 * @create 2019-08-15-14:06
 */
public class Demo3Recurison {
    public static void main(String[] args) {
        System.out.println(jc(5));
    }
    //定义方法使用递归计算阶乘
    public static int jc(int n){
        //获取到1的时候结束
        if(n==1){
            return 1;
        }
        //获取下一个被乘的数字(n-1)
        return n*jc(n-1);
    }
}
