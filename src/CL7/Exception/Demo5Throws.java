package CL7.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-08-10:48
 */
//如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
//    FileNotFoundException extends IOException extends Exception
public class Demo5Throws {
//    public static void main(String[] args) throws FileNotFoundException,IOException {
//    public static void main(String[] args) throws IOException {
    public static void main(String[] args) throws Exception {
        readFile("d:\\a.txt");
    }
    /*
    * 定义一个方法，对传递的文件路径进行合法性判断
    * 如果路径不是"D:\\a.txt",那么我们就抛出文件找不到异常对象，告知方法的使用者
    * FileNotFoundException是编译异常，抛出了编译异常，就必须处理这个异常
    * 可以使用throws继续声明抛出FileNotFoundException这个异常对象，让方法的调用者处理
    *
    */
    public static void readFile(String filename) throws FileNotFoundException,IOException{
        if(!filename.equals("d:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是d:\\a.txt");
        }
        /*
        *如果传递的路径，不是.txt结尾
        * 那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
        */
        if(filename.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
