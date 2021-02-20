package CL7.Interface;

/**
 * @author Promise
 * @create 2019-07-24-16:15
 */
public class MyInterfacePrivateImpl implements MyInterfacePrivateA{

    public void methodAnother(){
        //直接访问到了接口中的默认方法，这样是错误的
//        methodCommon();
    }
}
