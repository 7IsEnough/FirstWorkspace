package CL7.InnerClass.InnerClass1;

/**
 * @author Promise
 * @create 2019-07-29-10:07
 */
public class Outer {

    public void methodOuter(){
        class Inner{ //局部内部类
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
