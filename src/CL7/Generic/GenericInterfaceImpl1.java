package CL7.Generic;

/**
 * @author Promise
 * @create 2019-08-01-20:43
 */
public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
