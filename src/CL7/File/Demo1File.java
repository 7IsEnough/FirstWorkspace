package CL7.File;

import java.io.File;

/**
 * @author Promise
 * @create 2019-08-14-16:16
 */
public class Demo1File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//路径分隔符(环境变量)
        System.out.println(pathSeparator);//路径分隔符 Windows系统：分号;  Linux系统：冒号:

        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符 Windows系统：反斜杠\  Linux系统：正斜杠/
    }
}
