package CL7.ArrayList;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-22-16:23
 */
public class DemoArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        //从JDK1.7开始，右侧的尖括号内部可以不写内容，但<>本身还是要写的
        ArrayList<String> list = new ArrayList<String>();

        System.out.println(list);

        //向集合中添加数据
        list.add("明凯");
        list.add("简自豪");
        list.add("伊芙琳");
        list.add("薇恩");
//        list.add(100);  //错误写法，创建集合时已经声明类型为字符串，添加的元素必须为字符串
        System.out.println(list);

    }
}
