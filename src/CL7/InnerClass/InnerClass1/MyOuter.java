package CL7.InnerClass.InnerClass1;

/**
 * @author Promise
 * @create 2019-07-29-10:37
 */
public class MyOuter {

    public void methodOuter(){
        int num = 10; //所在方法的局部变量
        class MyInner {
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
