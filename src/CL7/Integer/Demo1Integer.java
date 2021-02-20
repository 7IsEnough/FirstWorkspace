package CL7.Integer;

/**
 * @author Promise
 * @create 2019-07-31-16:53
 */
public class Demo1Integer {
    public static void main(String[] args) {
        //装箱：把基本类型的数据，包装到包装类中(基本类型的数据->包装类)
        //构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

//        Integer in4 = Integer.valueOf("a");//数字格式化异常
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

        //拆箱：在包装类中取出基本类型的数据(包装类 -> 基本类型的数据)
        int i = in1.intValue();
        System.out.println(i);
    }
}
