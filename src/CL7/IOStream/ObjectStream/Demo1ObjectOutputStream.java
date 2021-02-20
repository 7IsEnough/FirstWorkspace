package CL7.IOStream.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Promise
 * @create 2019-08-21-10:56
 */
public class Demo1ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\workspace4Java\\person.txt"));
        //使用write方法，将对象写入文件中
        oos.writeObject(new Person("明凯",26));//以二进制字节方式存储，无法查看
        //释放资源
        oos.close();
    }
}
