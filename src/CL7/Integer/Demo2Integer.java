package CL7.Integer;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-31-21:03
 */
public class Demo2Integer {
    public static void main(String[] args) {
        //自动装箱：直接把int类型的整数赋值给包装类
        //Integer in = 1;就相当于 Integer in = new Integer(1);
        Integer in = 1;

        //自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本数据类型再进行计算
        //in+2;就相当于in.intvalue()+2 = 3
        //in = in.intvalue()+2=3 又是一个自动装箱
        in = in + 2;


        //ArrayList集合无法直接存储整数，可以存储Integer包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  //自动装箱list.add(new Integer(1));
        int a = list.get(0); //自动拆箱 list.get(0).invalue();
    }
}
