package CL7.IOStream.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Promise
 * @create 2019-08-21-15:02
 */
public class Demo2PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出的");
        PrintStream ps = new PrintStream("G:\\workspace4Java\\目的地是打印流.txt");
        System.setOut(ps);//把输出语句的目的地改变为打印流的目的地
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
