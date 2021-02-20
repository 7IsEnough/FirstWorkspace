package CL7.MethodOverload;

/**
 * @author Promise
 * @create 2019-07-19-9:56
 * 判断哪些方法是重载关系
 */
public class methodOverloadJudge {
    public static void open(){}   //正确重载
    public static void open(int a){}   //正确重载
   // static void open(int a,int b){}  //代码错误，和第8行冲突
    public static void open(double a,int b){}  //正确重载
    //public static void open(int a,double b){}  //代码错误，和第6行冲突
    public void open(int i,double d){}   //代码错误，和第5行冲突
    public static void OPEN(){}  //代码正确不会报错，但是并不是有效重载
    //public static void open(int i,int j){} //代码报错，和第3行冲突

}
