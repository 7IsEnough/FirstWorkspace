package CL7.FunctionalInterface.Lambda;

/**
 * @author Promise
 * @create 2019-08-21-21:40
 */
public class Demo2Lambda {
    public static void main(String[] args) {
        //定义3个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        //由于参数为函数式接口，可以传递Lambda表达式
        showLog(1,()->
                //返回一个拼接好的字符串
                msg1+msg2+msg3
                );
    }
    //定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level,MessageBulider mb){
        //对日志的等级进行判断,调用MessageBulider接口中的buliderMessage方法
        if(level == 1){
            System.out.println(mb.builderMessage());
        }

    }
}
