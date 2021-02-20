package CL7.InnerClass.Practice2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Promise
 * @create 2019-07-29-16:34
 */
public class DemoInterface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("明凯");
        list.add("简自豪");
        list.add("伊芙琳");
        list.add("薇恩");
        return list;
    }
}
