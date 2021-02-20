package CL7.FunctionalInterface.Consumer;

import java.util.function.Consumer;

/**
 * @author Promise
 * @create 2019-08-22-10:48
 */
public class Demo3Test {
    public static void main(String[] args) {
        String[] arr = {"明凯,男","简自豪,男","严君泽,男"};
        printInfo(arr,(message)->{
                    String[] name = message.split(",");
                    message = "姓名："+name[0];
                    System.out.print(message);
                },
                (message)->{
                    String[] age = message.split(",");
                    message = ",性别："+age[1];
                    System.out.println(message);
                });


    }
    //定义一个方法，参数传递一个字符串和两个Consumer接口，泛型使用String
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }

    }
}
