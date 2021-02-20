package CL7.Interface.Interface2;

/**
 * @author Promise
 * @create 2019-07-24-20:08
 */
public interface MyInterfaceB {
    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
