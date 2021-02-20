package CL7.Socket.FileUpload1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Promise
 * @create 2019-08-21-17:01
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建本地输入流FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\5.jpg");
        //创建Socket对象，构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //使用getOutputStream方法,获取网络字节输入流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //使用本地输入流对象方法read，读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!=-1){
            //使用网络输出流write，上传给服务器
            os.write(bytes,0,len);
        }
        //上传完文件，给服务端写一个结束标记
        socket.shutdownOutput();
        //使用getInputStream方法,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //使用网络输出流对象的read方法，读取服务器回写的数据
        while ((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //释放资源
        fis.close();
        socket.close();
    }
}
