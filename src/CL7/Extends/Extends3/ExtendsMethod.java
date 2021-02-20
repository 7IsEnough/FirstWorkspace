package CL7.Extends.Extends3;

/**
 * @author Promise
 * @create 2019-07-23-15:37
 */
public class ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        //创建的是子类对象，所以优先使用子类方法
        zi.method();
    }
}
