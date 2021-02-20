package CL7.IOStream.ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Promise
 * @create 2019-08-21-10:19
 */
public class Demo3InputStreamReader {
    public static void main(String[] args) throws IOException {
        read_utf_8();
        read_gbd();
    }


    //    使用InputStreamReader读取UTF-8格式的文件
    private static void read_utf_8() throws IOException {
        //创建InputStreamWriter对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\workspace4Java\\utf_8.txt"),"utf-8");
        //使用read方法读取文件
        int len = 0;
        while ((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        //释放资源
        isr.close();

    }
    //    使用InputStreamReader读取gbk格式的文件
    private static void read_gbd() throws IOException {
        //创建InputStreamWriter对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\workspace4Java\\gbk.txt"),"gbk");
        //使用read方法读取文件
        char[] cs = new char[1024];
        int len = 0;
        while ((len = isr.read(cs))!=-1){
            System.out.println(cs);
        }
        //释放资源
        isr.close();
    }

}
