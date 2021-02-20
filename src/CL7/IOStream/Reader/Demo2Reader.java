package CL7.IOStream.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-19-16:36
 */
public class Demo2Reader {
    public static void main(String[] args) throws IOException {
        //创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("G:\\workspace4Java\\c.txt");
        //使用read方法读取文件
//        int len = 0;
//        while((len = fr.read())!= -1){
//            System.out.print((char)len);
//        }

        int len = 0;
        char[] cs = new char[1024];
        while ((len = fr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
        //释放资源
        fr.close();

    }
}
