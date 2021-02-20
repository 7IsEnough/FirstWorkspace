package CL7.IOStream.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-10:27
 */
public class Demo1TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        //变量在使用的时候，必须有值
        FileWriter fw = null;
        try {
            //可能会出现异常的代码
            fw = new FileWriter("G:\\workspace4Java\\g.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld"+i+"\r\n");
            }

        }catch (IOException e){
            //异常的处理逻辑
            System.out.println(e);
        }finally {
            //一定会指定的代码
            //如果fw创建失败,fw为null，会报空指针异常
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
