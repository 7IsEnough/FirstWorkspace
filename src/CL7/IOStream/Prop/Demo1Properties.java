package CL7.IOStream.Prop;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author Promise
 * @create 2019-08-20-15:06
 */
public class Demo1Properties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }




    //    使用Properties集合存储数据，遍历取出Properties集合中的数据
    private static void show01() {
        //创建Properties集合对象
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力娜扎","160");

        //使用stringPropertyNames方法把集合中的键取出，存储到一个Set集合中
        Set<String> set = prop.stringPropertyNames();
        //遍历set集合
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }

    //可以用store方法将集合中的临时数据写入硬盘中存储
    private static void show02() throws IOException {
        //创建Properties集合对象
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力娜扎","160");

        //创建字节输出流/字符输出流对象，构造方法致命输出的目的地
        FileWriter fw = new FileWriter("G:\\workspace4java\\prop.txt");

        //使用store方法
        prop.store(fw,"save data");

        //释放资源
        fw.close();

        //若使用字节流对象来写，容易乱码
//        prop.store(new FileOutputStream("G:\\workspace4java\\prop.txt"),"");


    }

    //使用load方法，把硬盘中保存的文件(键值对),读取到集合中使用
    private static void show03() throws IOException {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用load方法读取保存键值对的文件
        prop.load(new FileReader("G:\\workspace4java\\prop.txt"));

        //遍历Properties集合
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
