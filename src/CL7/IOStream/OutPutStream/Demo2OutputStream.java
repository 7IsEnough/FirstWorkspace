package CL7.IOStream.OutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Promise
 * @create 2019-08-16-9:59
 */
public class Demo2OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("G:\\workspace4Java\\b.txt"));
        //2.调用FileOutputStream对象中的方法write，把数据写入到文件中
        //在文件中显示100，需要3个字节
        fos.write(49);
        fos.write(48);
        fos.write(48);

//        byte[] bytes = {-65,66,-67,68,69};
        byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);

        fos.write(bytes,1,2);

        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);
        //3.释放资源
        fos.close();

    }
}
