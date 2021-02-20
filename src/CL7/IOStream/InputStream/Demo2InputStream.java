package CL7.IOStream.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-19-15:01
 */
public class Demo2InputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("G:\\workspace4Java\\b.txt");
        //使用方法read读取文件
        //int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
//        byte[] bytes = new byte[2];
//        int len = fis.read(bytes);
//        System.out.println(len);//2
////        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));//AB
//
//        len = fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(new String(bytes));//CD
//
//        len = fis.read(bytes);
//        System.out.println(len);//1
//        System.out.println(new String(bytes));//ED
//
//        len = fis.read(bytes);
//        System.out.println(len);//-1
//        System.out.println(new String(bytes));//ED

        //使用循环优化，循环结束条件，读取到-1结束
        byte[] bytes = new byte[1024];
        int len = 0;//记录读取的有效字节个数
        while ((len = fis.read(bytes))!=-1){
            //只将byte数组中有效的元素转换为字符串
            //String(byte[] bytes,int offset,int length)
            //                        开始索引    转换的字节个数
            System.out.println(new String(bytes,0,len));
        }
        //释放资源
        fis.close();

    }
}
