package CL7.File;

import java.io.File;

/**
 * @author Promise
 * @create 2019-08-15-10:49
 */
public class Demo6File {
    public static void main(String[] args) {
        show01();
        show02();
    }


    //    public String[] list():返回一个String数组，表示该File目录中的所有子文件或目录
    private static void show01() {
        File file = new File("G:\\workspace4Java");
//        File file = new File("G:\\workspaceJava");//路径不存在，返回空指针异常
//        File file = new File("G:\\workspace4Java\\workspace4Java.iml");//路径不是目录，返回空指针异常
        String[] arr = file.list();
        for (String filename : arr) {
            System.out.println(filename);
        }
    }

//    public File[] listFiles():返回一个File数组，表示该File目录中的所有的子文件或目录
    private static void show02() {
        File file = new File("G:\\workspace4Java");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
