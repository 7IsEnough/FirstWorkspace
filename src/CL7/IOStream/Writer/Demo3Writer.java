package CL7.IOStream.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-20-10:14
 */
public class Demo3Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("G:\\workspace4Java\\f.txt");
        char[] cs = {'a','b','c','d','e'};
        //void write(char[] cbuf)写入字符数组
        fw.write(cs);

        //写字符数组的一部分
        fw.write(cs,1,3);

        //写入字符串
        fw.write("明凯");

        //写入字符串的一部分
        fw.write("Clearlove明凯",0,9);
        fw.close();
    }
}
