package CL7.ArrayList.ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Promise
 * @create 2019-07-22-19:22
 * 用大集合存20个随机数字，将其中的偶数放在小集合中
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数总共有"+smallList.size()+"个");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
