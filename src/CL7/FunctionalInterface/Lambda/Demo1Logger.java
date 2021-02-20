package CL7.FunctionalInterface.Lambda;

/**
 * @author Promise
 * @create 2019-08-21-21:35
 */
public class Demo1Logger {
    public static void main(String[] args) {
        //定义3个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1,msg1+msg2+msg3);
    }
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level,String message){
        //对日志的等级进行判断
        if(level == 1){
            System.out.println(message);
        }
    }
}
