package CL7.IOStream.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-19-17:02
 */
public class Demo1Writer {
    public static void main(String[] args) throws IOException {
        //创建FileWriter对象，构造方法中写入数据的目的地
        FileWriter fw = new FileWriter("G:\\workspace4Java\\d.txt");
        //使用write方法，将数据写入到内存缓冲区中(字符转换为字节的过程)
        fw.write(97);
        //使用flush方法，把内存缓冲区中的数据，刷新到文件中
//        fw.flush();
        //释放资源(会先把内存缓冲区中的数据，刷新到文件中)
        fw.close();
    }
}

