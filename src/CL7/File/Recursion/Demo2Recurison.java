package CL7.File.Recursion;

/**
 * @author Promise
 * @create 2019-08-15-13:48
 */
public class Demo2Recurison {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    //定义一个方法，使用递归计算1-n之间的和
    public static int sum(int n){
        //获取到1的时候就结束
        if(n==1){
            return 1;
        }
        //获取下一个被加的数字(n-1)
        return n+sum(n-1);
    }
}
