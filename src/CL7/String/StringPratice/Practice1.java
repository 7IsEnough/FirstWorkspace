package CL7.String.StringPratice;

/**
 * @author Promise
 * @create 2019-07-23-9:51
 * 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串
 * 格式：[word1#word2#word3]
 */
public class Practice1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String result = formArrayToString(array);
        System.out.println(result);
    }

    public static String formArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str+="word"+array[i]+"]";
            }else {
                str+="word"+array[i]+"#";
            }
        }
        return str;
    }
}