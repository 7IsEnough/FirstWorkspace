package CL7.IOStream.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-19-16:07
 */
public class Demo1CopyFile {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\5.jpg");
        //创建字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("G:\\workspace4Java\\5.jpg");

        //一次读取一个字节写入一个字节的方式
        //使用字节输入流对象中的方法read读取文件
//        int len = 0;
//        while ((len = fis.read())!=-1){
//            //使用write方法，把读到的字节写入到目的地的文件夹中
//            fos.write(len);
//        }

        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        //释放资源(先关写的，后关闭读的；如果写完了，肯定读取完毕了)
        fos.close();
        fis.close();

    }
}
