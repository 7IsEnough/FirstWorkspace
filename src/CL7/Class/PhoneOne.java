package CL7.Class;

/**
 * @author Promise
 * @create 2019-07-19-21:02
 * 创建Phone类的对象1
 */
public class PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388;
        one.color = "黑色";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("明凯");
        one.sendMessage();

    }
}
