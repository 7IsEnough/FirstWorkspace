package CL7.Abstract.Abstract1;

/**
 * @author Promise
 * @create 2019-07-24-10:06
 */
public class Zi extends Fu {

    public Zi(){
        //super();
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
