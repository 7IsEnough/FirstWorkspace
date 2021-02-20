package CL7.File;

import java.io.File;

/**
 * @author Promise
 * @create 2019-08-14-16:27
 */
public class Demo2File {
    public static void main(String[] args) {
        show01();
        show02("G:\\workspace4Java","a.txt");
        show03();
    }




    //File(String pathname)通过将给定路径名字符串转换为抽象路径名来创建一个新File实例
    private static void show01() {
        File f1 = new File("G:\\workspace4Java\\a.txt");
        System.out.println(f1);//重写了Object类的toString方法

        File f2 = new File("G:\\workspace4Java");
        System.out.println(f2);//重写了Object类的toString方法

        File f3 = new File("clearlove.txt");
        System.out.println(f3);
    }

    //File(String parent,String child)根据parent路径名字符串和child路径名字符串创建一个新File实例
    private static void show02(String parent,String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    //File(File parent,String child)根据parent抽象路径名和child路径名字符串创建一个新File实例
    private static void show03() {
        File parent = new File("G:\\workspace4Java");
        File file = new File(parent,"Hello.java");
        System.out.println(file);
    }
}
