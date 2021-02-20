package CL7.Exception;

/**
 * @author Promise
 * @create 2019-08-09-10:05
 */
public class Demo9Exception {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }
    //定义一个方法，返回变量a的值
    public static int getA(){
        int a = 10;
        try {
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            //一定会执行的代码
            a = 100;
            return a;
        }
    }
}
