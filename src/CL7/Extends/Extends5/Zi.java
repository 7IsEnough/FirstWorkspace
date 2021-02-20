package CL7.Extends.Extends5;

/**
 * @author Promise
 * @create 2019-07-23-20:11
 */
public class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        super.method();
        System.out.println("子类方法");
    }

    public void show(){
        int num = 30;
        System.out.println(num); //30
        System.out.println(this.num); // 20
        System.out.println(super.num); // 10
    }
}
