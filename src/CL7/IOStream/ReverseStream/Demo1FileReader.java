package CL7.IOStream.ReverseStream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-22:16
 */
public class Demo1FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("G:\\workspace4Java\\我是GBK格式的文本.txt");
        int len =0;
        while ((len = fr.read())!=-1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
