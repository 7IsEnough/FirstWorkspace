package CL7.File;

import java.io.File;

/**
 * @author Promise
 * @create 2019-08-14-20:40
 */
public class Demo4File {
    public static void main(String[] args) {
        show01();
        show02();
    }

//    public boolean exists():此File表示的文件或目录是否实际存在
    private static void show01() {
        File f1 = new File("G:\\workspace4Java");
        System.out.println(f1.exists());

        File f2 = new File("G:\\workspace4Java1");
        System.out.println(f2.exists());

        File f3 = new File("workspace4Java.iml");
        System.out.println(f3.exists());

        File f4 = new File("workspace4Java11.iml");
        System.out.println(f4.exists());
    }

//    public boolean isDirectory():此File表示的是否为目录
//    public boolean isFile():此File表示的是否为文件
    private static void show02() {
        File f1 = new File("G:\\workspace4Java1");
        //不存在就没有必要获取
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
        File f2 = new File("G:\\workspace4Java");
        if(f2.exists()){
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }

        File f3 = new File("G:\\workspace4Java\\workspace4Java.iml");
        if(f3.exists()){
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }

    }


}
