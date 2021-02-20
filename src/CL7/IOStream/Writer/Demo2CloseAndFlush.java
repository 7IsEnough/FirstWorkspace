package CL7.IOStream.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-10:10
 */
public class Demo2CloseAndFlush {
    public static void main(String[] args) throws IOException {
        //创建FileWriter对象，构造方法中写入数据的目的地
        FileWriter fw = new FileWriter("G:\\workspace4Java\\e.txt");
        //使用write方法，将数据写入到内存缓冲区中(字符转换为字节的过程)
        fw.write(97);
        //使用flush方法，把内存缓冲区中的数据，刷新到文件中
        fw.flush();
        //刷新之后流可以继续使用
        fw.write(98);
        //释放资源(会先把内存缓冲区中的数据，刷新到文件中)
        fw.close();
        //close方法后流就关闭了，无法再继续使用
    }
}
