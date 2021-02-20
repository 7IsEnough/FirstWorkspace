package CL7.Exception;

import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-08-15:53
 */
public class Demo6TryCatch {
    public static void main(String[] args) {
        try {
            //可能产生异常的代码
            readFile("d:\\a.tx");
            System.out.println("资源释放");
        }catch (IOException e){//try中抛出什么异常对象，catch就定义什么异常变量,用来接收这个异常对象
            //异常的处理逻辑
//            System.out.println("catch--传递的文件后缀不是.txt");

            /*
            *Throwable类中定义了3个异常处理的方法
            * 1.Public String getMessage():返回此throwable的简短描述
            * 2.Public String toString():返回此throwable的详细消息字符串
            * 3.Public void printStackTrace():JVM打印异常对象，默认此方法，打印的异常信息是最全面的
            */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }
    /*
     *如果传递的路径，不是.txt结尾
     * 那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
     */
    public static void readFile(String filename) throws IOException {
        if(!filename.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
