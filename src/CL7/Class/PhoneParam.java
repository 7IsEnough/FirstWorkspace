package CL7.Class;

/**
 * @author Promise
 * @create 2019-07-21-10:34
 * 将Phone对象作为方法参数
 */
public class PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";

        method(one);//传递进入的参数是地址值
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
}
