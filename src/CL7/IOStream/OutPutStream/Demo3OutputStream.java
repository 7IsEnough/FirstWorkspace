package CL7.IOStream.OutPutStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-16-10:18
 */
public class Demo3OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("G:\\workspace4Java\\c.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
