package CL7.IOStream.ReverseStream;

import java.io.*;

/**
 * @author Promise
 * @create 2019-08-21-10:34
 */
public class Demo4Test {
    public static void main(String[] args) throws IOException {
        //创建InputStreamReader对象，构造方法中传递字节输入流和指定编码表名称GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\workspace4Java\\我是GBK格式的文本.txt"),"gbk");
        //创建OutputStreamWriter对象，构造方法中传递字节输出流和指定编码表名称UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\workspace4Java\\我是UTF-8格式的文本.txt"),"utf-8");
        //使用read方法读取文件
        char[] cs = new char[1024];
        int len = 0;
        while ((len = isr.read(cs))!=-1){
            //使用write方法写文件
            osw.write(cs,0,len);
        }
        //释放资源
        osw.close();
        isr.close();


    }
}
