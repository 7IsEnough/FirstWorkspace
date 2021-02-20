package CL7.MethodReference.StaticMethodReference;

/**
 * @author Promise
 * @create 2019-08-23-9:00
 */
public class Demo1StaticMethodReference {
    public static void main(String[] args) {
        //调用method方法，传递计算绝对值的整数,和Lambda表达式
        int number = method(-10, (int num) -> {
            return Math.abs(num);
        });
        System.out.println(number);
        int number2 = method(-20, Math::abs);
        System.out.println(number2);

    }
    //定义一个方法，方法的参数传递要计算绝对值的整数，和函数式接口
    public static int method(int number,Calcable c){
        return c.calsAbs(number);
    }
}
