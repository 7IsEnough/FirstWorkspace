package CL7.InnerClass;

/**
 * @author Promise
 * @create 2019-07-29-10:04
 */
public class Demo2InnerClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}
