package CL7.Class;

/**
 * @author Promise
 * @create 2019-07-22-10:12
 * 局部变量和成员变量的区别
 */
public class VariableDifference {
    String name;//成员变量

    public void methodA(){
        int num = 20;//局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param){
        //参数在方法调用的时候，必然会被赋值
        System.out.println(param);
        int age;//局部变量
//      System.out.println(age);  //没赋值不能用
//      System.out.println(num);  //错误写法
        System.out.println(name);

    }
}
