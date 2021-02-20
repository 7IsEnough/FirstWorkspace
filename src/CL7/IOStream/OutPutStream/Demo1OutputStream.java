package CL7.IOStream.OutPutStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-16-9:40
 */
public class Demo1OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("G:\\workspace4Java\\a.txt");
        //2.调用FileOutputStream对象中的方法write，把数据写入到文件中
        //public abstract void write(int b):将指定的字节输出流
        fos.write(97);
        //3.释放资源
        fos.close();
    }
}
