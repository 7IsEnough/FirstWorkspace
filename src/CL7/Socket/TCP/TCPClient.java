package CL7.Socket.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Promise
 * @create 2019-08-21-16:01
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建客户端对象Socket,构造方法绑定服务器的IP地址与端口号
        //若没有服务器，会报链接异常
        Socket socket = new Socket("127.0.0.1",8888);
        //使用对象的getOutputStream()方法获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //使用OutputStream对象的方法write给服务器发送数据
        os.write("你好服务器".getBytes());
        //使用对象的getInputStream()方法获取网络字节输出流InputStream对象
        InputStream is = socket.getInputStream();
        //使用InputStream对象的方法read读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //释放资源
        socket.close();

    }
}
