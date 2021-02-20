package CL7.Socket.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Promise
 * @create 2019-08-21-16:14
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //使用对象的accept方法，获取请求的客户端对象Socket
        Socket socket = server.accept();
        //使用Socket对象的getInputStream()方法获取网络字节输出流InputStream对象
        InputStream is = socket.getInputStream();
        //使用InputStream对象的方法read读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        //使用Socket对象的getOutputStream()方法获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //使用OutputStream对象的方法write向客户端回写数据
        os.write("收到谢谢".getBytes());
        //释放资源
        socket.close();
        server.close();

    }
}
