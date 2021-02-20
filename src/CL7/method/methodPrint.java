package CL7.method;

/**
 * @author Promise
 * @create 2019-07-18-16:29
 * 打印指定次数的HelloWorld
 */
public class methodPrint {
    public static void main(String[] args) {
        printCount(5);
    }
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello,World"+(i+1));
        }
    }
}
