package CL7.Extends.Extends1;

/**
 * @author Promise
 * @create 2019-07-23-15:07
 */
public class Fu {
    int numFu = 10;
    int num = 100;

    public void methodFu(){
        //使用的是本类当中的，不会向下找子类的
        System.out.println(num);
    }
}
