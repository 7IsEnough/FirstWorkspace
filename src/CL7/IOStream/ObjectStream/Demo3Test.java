package CL7.IOStream.ObjectStream;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-08-21-13:45
 */
public class Demo3Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //定义一个存储Person对象的ArrayList集合
        ArrayList<Person> list = new ArrayList<>();
        //往集合中存储Person对象
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        //创建序列化ObjectOutputStream对象，使用writeObject方法，对集合进行序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\workspace4Java\\list.txt"));
        oos.writeObject(list);
        //创建反序列化ObjectInputStream对象，使用readObject方法，读取文件保存的集合
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\workspace4Java\\list.txt"));
        Object o = ois.readObject();
        //把Object类型的集合转换为ArrayList类型
        ArrayList<Person> list2 = (ArrayList<Person>)o;
        //打印集合
        for (Person p : list2) {
            System.out.println(p);
        }
        //释放资源
        ois.close();
        oos.close();

    }
}
