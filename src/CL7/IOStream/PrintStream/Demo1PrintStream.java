package CL7.IOStream.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Promise
 * @create 2019-08-21-14:00
 */
public class Demo1PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("G:\\workspace4Java\\print.txt");
        //使用write方法写数据
        ps.write(97);
        ps.println(97);
        //释放资源
        ps.close();
    }
}
