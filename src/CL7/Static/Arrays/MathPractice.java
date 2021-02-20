package CL7.Static.Arrays;

/**
 * @author Promise
 * @create 2019-07-23-14:26
 * 计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
 */
public class MathPractice {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        //这样处理，变量i就是区间内所有的整数
        for(int i = (int)min; i<max ; i++ ){
            int abs = Math.abs(i);
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有"+count+"个");
    }
}
