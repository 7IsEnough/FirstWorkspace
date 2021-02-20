package CL7.File;

import java.io.File;

/**
 * @author Promise
 * @create 2019-08-14-20:11
 */
public class Demo3File {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }




    //    public String getAbsolutePath()：返回此File的绝对路径名字符串
    private static void show01() {
        File f1 = new File("G:\\workspace4Java\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);
    }

//    public String getPath()：将此File转换为路径名字符串
    private static void show02() {
        File f1 = new File("G:\\workspace4Java\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);
        System.out.println(path2);
    }

//    public String getName():返回由此File表示的文件或目录的名称
    private static void show03() {
        File f1 = new File("G:\\workspace4Java\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);

        File f2 = new File("G:\\workspace4Java");
        String name2 = f2.getName();
        System.out.println(name2);
    }

//    public long length():返回由此File表示的文件的长度
    private static void show04() {
        File f1 = new File("F:\\家里地址.txt");
        long l1 = f1.length();
        System.out.println(l1);

        File f2 = new File("F:\\家里地址.jpg");
        long l2 = f2.length();
        System.out.println(l2);

        File f3 = new File("G:\\workspace4Java");
        long l3 = f3.length();
        System.out.println(l3);
    }
}
