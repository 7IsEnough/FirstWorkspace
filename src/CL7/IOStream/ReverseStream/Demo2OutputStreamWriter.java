package CL7.IOStream.ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Promise
 * @create 2019-08-21-9:56
 */
public class Demo2OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
        write_gbk();
    }



    //    使用转换流OutputStreamWriter写UTF-8格式的文件
    private static void write_utf_8() throws IOException {
        //创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\workspace4Java\\utf_8.txt"),"utf-8");
        //使用write方法，把字符转换为字节存储缓冲区中(编码)
        osw.write("你好");
        //使用flush方法，把内存缓冲区的字节刷新到文件中(使用字节流写字节的过程)
        osw.flush();
        //释放资源
        osw.close();
    }

    //    使用转换流OutputStreamWriter写gbk格式的文件
    private static void write_gbk() throws IOException {
        //创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\workspace4Java\\gbk.txt"),"gbk");
        //使用write方法，把字符转换为字节存储缓冲区中(编码)
        osw.write("你好");
        //使用flush方法，把内存缓冲区的字节刷新到文件中(使用字节流写字节的过程)
        osw.flush();
        //释放资源
        osw.close();
    }
}
