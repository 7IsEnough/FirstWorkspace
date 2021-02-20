package CL7.IOStream.TryCatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-10:44
 */
public class Demo2JD7 {
    public static void main(String[] args) {
        try( //创建字节输入流对象，构造方法中绑定要读取的数据源
             FileInputStream fis = new FileInputStream("D:\\5.jpg");
             //创建字节输出流对象，构造方法中绑定要写入的目的地
             FileOutputStream fos = new FileOutputStream("G:\\workspace4Java\\5.jpg");) {


            //一次读取一个字节写入一个字节的方式
            //使用字节输入流对象中的方法read读取文件
            int len = 0;
            while ((len = fis.read())!=-1){
                //使用write方法，把读到的字节写入到目的地的文件夹中
                fos.write(len);
            }
        }catch (IOException e){
            System.out.println(e);
        }



    }
}
