package CL7.Static.Arrays;

import java.util.Arrays;

/**
 * @author Promise
 * @create 2019-07-23-14:08
 * 使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
 */
public class ArraysPractice {
    public static void main(String[] args) {
        String str = "sdfasdfasdfasdfa";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length-1; i > 0; i--) {
            System.out.println(chars[i]);
        }


    }
}
