package CL7.Generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Promise
 * @create 2019-08-01-21:32
 */
public class Demo6Generic {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
//        getElement1(list2);//报错
        getElement1(list3);
//        getElement1(list4);//报错


//        getElement2(list1);//报错
//        getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);

        /*
        *类与类之间的继承关系
        * Integer extends Number extends Object
        * String extends Object
        */
    }
    public static void getElement1(Collection<? extends Number> coll){}
    public static void getElement2(Collection<? super Number> coll){}
}
