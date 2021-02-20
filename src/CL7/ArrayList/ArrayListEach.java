package CL7.ArrayList;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-22-16:51
 * 遍历集合
 */
public class ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("薇恩");
        list.add("崔丝塔娜");
        list.add("维鲁斯");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
