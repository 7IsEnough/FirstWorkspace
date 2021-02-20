package CL7.ArrayList.ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Promise
 * @create 2019-07-22-17:04
 * 生成6个1-33之间的随机整数，添加到集合，并遍历集合
 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
    }
}
