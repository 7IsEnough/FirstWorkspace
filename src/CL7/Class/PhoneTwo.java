package CL7.Class;

/**
 * @author Promise
 * @create 2019-07-20-9:51
 * 创建2个Phone类对象
 */
public class PhoneTwo {
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
        System.out.println("============");


        Phone two = new Phone();
        two.brand = "三星";
        two.price = 5999;
        two.color = "蓝色";

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        two.call("李相赫");
        two.sendMessage();


    }
}
