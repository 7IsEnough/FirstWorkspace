package CL7.ArrayList;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-22-16:38
 * ArrayList常用方法
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("明凯");
        System.out.println(list);
        System.out.println("添加的动作是否成功："+success);

        list.add("李青");
        list.add("卡特琳娜");
        list.add("卡莉斯塔");
        list.add("嘉文四世");
        System.out.println(list);

        String name = list.get(2);
        System.out.println("第2号索引位置："+name);


        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是："+whoRemoved);
        System.out.println(list);

        int size = list.size();
        System.out.println("集合的长度是："+size);

    }
}
