package CL7.Class;

/**
 * @author Promise
 * @create 2019-07-21-11:04
 * 将自定义的Phone对象作为方法的返回值
 */
public class PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "玫瑰金";
        return one;
    }
}
