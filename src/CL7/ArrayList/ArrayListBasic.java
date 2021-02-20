package CL7.ArrayList;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-22-16:55
 * 向集合中存放基本数据类型
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //错误写法！泛型只能是引用类型，不能是基本类型
//    ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);

        int num = listC.get(1);
        System.out.println("第1号元素是："+num);
    }

}
