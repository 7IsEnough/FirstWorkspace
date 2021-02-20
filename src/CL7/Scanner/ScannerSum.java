package CL7.Scanner;
import java.util.Scanner;

/**
 * @author Promise
 * @create 2019-07-22-14:09
 * 键盘输入2个int数字，然后求和
 */
public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("结果是："+result);
    }
}
