package CL7.Extends.Extends4;

/**
 * @author Promise
 * @create 2019-07-23-19:48
 */
public class Zi extends Fu{
    int num = 20;

    public Zi(){
        super();
    }

    public void methodZi(){
        System.out.println(super.num);//父类中的num
    }

    public void method(){
        super.method();//访问父类中的method
        System.out.println("子类方法");
    }
}
