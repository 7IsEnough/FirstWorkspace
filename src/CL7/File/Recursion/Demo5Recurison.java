package CL7.File.Recursion;

import java.io.File;

/**
 * @author Promise
 * @create 2019-08-15-14:50
 */
public class Demo5Recurison {
    public static void main(String[] args) {
        File file = new File("D:\\abc");
        getAllFile(file);
    }
    //定义一个方法，参数传递File类型的目录，对目录进行遍历
    public static void getAllFile(File dir){
        //打印被遍历的目录名称
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断，判断是否为文件夹
            if(f.isDirectory()){
                //f是一个文件夹，则继续遍历这个文件夹
                //直接递归调用getAllFile方法，遍历文件夹
                getAllFile(f);
            }else {
                //f是一个文件，直接打印即可
                //只要.java结尾的文件
                //1.把File对象f，转为字符串对象
//                String s = f.getAbsolutePath();

                //把字符串转为小写
//                s = s.toLowerCase();
                //2.调用String类中的方法endWith判断字符串是否以.java结尾
//                boolean b = s.endsWith(".java");
                //3.如果是以.java结尾的文件，则输出
//                if (b){
//                    System.out.println(f);
//                }

                if(f.getAbsolutePath().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }



            }
        }
    }
}
