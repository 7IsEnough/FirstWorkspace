package CL7.IOStream.Reader;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-19-16:30
 */
public class Demo1InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("G:\\workspace4java\\c.txt");
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.println((char) len);
        }
        fis.close();
    }
}
