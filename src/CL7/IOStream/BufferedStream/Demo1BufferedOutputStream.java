package CL7.IOStream.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-20:04
 */
public class Demo1BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("G:\\workspace4Java\\a.txt");
        //创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //使用write方法，把数据写入到内部缓冲区中
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        //使用flush方法，把内部缓冲区中的数据，刷新到文件中
        bos.flush();
        //释放资源
        bos.close();

    }
}
