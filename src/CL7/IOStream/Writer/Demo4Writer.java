package CL7.IOStream.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-10:21
 */
public class Demo4Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("G:\\workspace4Java\\g.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("HelloWorld"+i+"\r\n");
        }
        fw.close();
    }
}
