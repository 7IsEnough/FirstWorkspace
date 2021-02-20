package CL7.IOStream.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-21:17
 */
public class Demo4BufferedReader {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("G:\\workspace4Java\\c.txt"));
        //使用readLine方法读取文本
        String line;
//        String line = br.readLine();
//        System.out.println(line);
        while ((line = br.readLine())!= null){
            System.out.println(line);
        }
        //释放资源
        br.close();
    }
}
