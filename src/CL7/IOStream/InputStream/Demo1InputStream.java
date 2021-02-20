package CL7.IOStream.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-16-10:49
 */
public class Demo1InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("G:\\workspace4Java\\a.txt");

        //2.调用FileInputStream对象中的方法read，读取文件
        //int read()读取文件中的一个字节并返回，读取到文件的末尾返回-1


        //使用循环读取文件,结束条件:读取到-1时结束
        int len = 0;
        while ((len = fis.read())!= -1){
            System.out.println((char)len);
        }

        //3.释放资源
        fis.close();
    }
}
