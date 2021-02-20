package CL7.Anonymous;

/**
 * @author Promise
 * @create 2019-07-22-14:25
 * 匿名对象
 */
public class Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "明凯";
        one.showName();
        System.out.println("==========");

        //匿名对象
        new Person().name = "简自豪";
        new Person().showName();
    }
}
