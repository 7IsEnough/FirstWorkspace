package CL7.Object;

/**
 * @author Promise
 * @create 2019-07-29-20:41
 */
public class Demo1ToString {
    public static void main(String[] args) {
        //Person对象默认继承了Object类，可以使用Object类中的toString方法
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(p);
        System.out.println(s);//输出为地址值

    }
}
