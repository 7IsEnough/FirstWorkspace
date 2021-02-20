package CL7.IOStream.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-20:45
 */
public class Demo3BufferedWriter {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象，构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\workspace4Java\\c.txt"));
        //使用write方法，把数据写入内存缓冲区中
        for (int i = 0; i < 10; i++) {
            bw.write("明凯");
//            bw.write("\r\n");
            bw.newLine();
        }
        //使用flush方法将内存缓冲区的数据，刷新到文件中
        bw.flush();
        //释放资源
        bw.close();
    }
}
