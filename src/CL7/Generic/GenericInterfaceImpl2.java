package CL7.Generic;

/**
 * @author Promise
 * @create 2019-08-01-20:56
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
