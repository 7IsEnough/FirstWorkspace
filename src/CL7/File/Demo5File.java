package CL7.File;

import java.io.File;
import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-14-20:58
 */
public class Demo5File {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

//public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
    private static void show01() {
        File f1 = new File("G:\\workspace4Java\\1.txt");
        boolean b1 = false;
        try {
            b1 = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("b1:"+b1);

        File f2 = new File("2.txt");
        boolean b2 = false;
        try {
            b2 = f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("b2:"+b2);

        File f3 = new File("新建文件夹");
        boolean b3 = false;
        try {
            b3 = f3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("b3:"+b3);//不要被名称迷惑，要看类型

//        File f4 = new File("G:\\workspaceJava\\1.txt");
//        boolean b4 = false;
//        try {
//            b4 = f4.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("b4:"+b4);//路径不存在，抛出异常
    }

//    public boolean mkdir():创建由此File表示的目录(只能创建单级文件夹)
//    public boolean mkdirs():创建由此File表示的目录，包括任何必需但不存在的父目录
//    既可以创建单级文件夹，也可以创建多级文件夹
    private static void show02() {
        File f1 = new File("aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1:"+b1);

        File f2 = new File("111\\222\\333\\444");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:"+b2);

        File f3 = new File("abc.txt");
        boolean b3 = f3.mkdirs();//看类型，为文件夹
        System.out.println("b3:"+b3);

        File f4 = new File("08_F\\ccc");
        boolean b4 = f4.mkdirs();//路径不存在，会创建路径文件夹
        System.out.println("b4:"+b4);
    }

//    public boolean delete():删除由此File表示的文件或目录
    private static void show03() {
        File f1 = new File("08_F");
        boolean b1 = f1.delete();
        System.out.println("b1:"+b1);

        File f2 = new File("111");
        System.out.println("b2:"+f2.delete());

    }

}
