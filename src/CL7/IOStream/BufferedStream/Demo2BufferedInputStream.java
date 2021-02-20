package CL7.IOStream.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-20:15
 */
public class Demo2BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("G:\\workspace4Java\\a.txt");
        //创建BufferedInputStream对象，构造方法中传递FileInputStream对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        //使用read方法读取文件
//        int len = 0;
//        while ((len = fis.read())!=-1){
//            System.out.println(len);
//        }
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //释放资源
        bis.close();
    }
}
