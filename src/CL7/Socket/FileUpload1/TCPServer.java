package CL7.Socket.FileUpload1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author Promise
 * @create 2019-08-21-19:08
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象，和系统要指定端口号
        ServerSocket server = new ServerSocket(8888);
        //让服务器一直处于监听状态(死循环accept方法)
        while (true){
            //使用accept方法获取服务器对象socket
            Socket socket = server.accept();
            //使用多线程提高程序的效率，有一个客户端上传文件，就开启一个线程
            new Thread(new Runnable() {
                //完成文件的上传
                @Override
                public void run() {
                    try {
                        //使用socket对象的getInputStream方法,获取网络输入流对象
                        InputStream is = socket.getInputStream();
                        //创建本地输出流对象,指定输出的目的地
                        File file = new File("D:\\upload");
                        //判断目录D:\\upload是否存在,如果不存在则创建
                        if(file.exists()==false){
                            file.mkdirs();
                        }
                        //自定义一个文件的命名规则，防止同名的文件被覆盖
                        //规则：域名+毫秒值+随机数
                        String filename = "kobe"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
                        FileOutputStream fos = new FileOutputStream("D:\\upload\\"+filename);


                        //使用网络输入流对象的read方法,读取客户端上传的文件
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes))!=-1){
                            //使用write方法打印从客户端上传的文件流
                            fos.write(bytes,0,len);
                        }
                        //向客户端回复
                        OutputStream os = socket.getOutputStream();
                        os.write("上传成功".getBytes());
                        //释放资源
                        fos.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();

        }

//        server.close();
    }
}
