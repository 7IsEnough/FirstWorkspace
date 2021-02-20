package CL7.IOStream.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Promise
 * @create 2019-08-21-13:13
 */
public class Demo2ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        创建ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\workspace4Java\\person.txt"));
        //使用readObject方法读取保存对象的文件
        Object obj = ois.readObject();
        //释放资源
        ois.close();
        //打印读取出来的对象
        System.out.println(obj);
    }
}
