package CL7.Interface.Interface2;

/**
 * @author Promise
 * @create 2019-07-24-20:09
 */
//这个子接口有几个方法？4个
    //methodA 来源于接口A
// methodB 来源于接口B
// methodCommon 同时来源于接口A和B
//    method 来源于自己
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();


    @Override
     public default void methodDefault() {

    }
}
