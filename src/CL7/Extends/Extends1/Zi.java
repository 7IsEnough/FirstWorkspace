package CL7.Extends.Extends1;

/**
 * @author Promise
 * @create 2019-07-23-15:07
 */
public class Zi extends Fu {
    int numZi = 20;
    int num = 200;

    public void methodZi(){
        //因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
    }
}
