package CL7.Extends.Constructor;

/**
 * @author Promise
 * @create 2019-07-23-16:43
 */
public class Zi extends Fu {
    public Zi(){
        super(20);
        System.out.println("子类构造方法");
    }

    public void method(){
//        super(); //错误写法！只有子类构造方法，才能调用父类构造方法
    }
}
