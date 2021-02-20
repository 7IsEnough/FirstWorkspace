package CL7.MethodReference;

/**
 * @author Promise
 * @create 2019-08-22-20:29
 */
public class Demo1Printable {
    public static void main(String[] args) {
        //参数为函数式接口，传递Lambda表达式
        printString((String str)->{
            System.out.println(str);
        });
        printString(System.out::println);
    }
    //定义一个方法，参数传递Printable接口，打印字符串
    public static void printString(Printable p){
        p.print("明凯");
    }
}
