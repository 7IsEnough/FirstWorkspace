package CL7.IOStream.CopyFile;

import java.io.*;

/**
 * @author Promise
 * @create 2019-08-20-20:36
 */
public class Demo3CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\5.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\workspace4Java\\5.jpg"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时："+(e-s)+"毫秒");
    }
}
