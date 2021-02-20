package CL7.InnerClass;

/**
 * @author Promise
 * @create 2019-07-29-9:59
 */
public class Outer {

    int num = 10; // 外部类的成员变量

    public class Inner {

        int num = 20;//内部类的成员变量

        public void methodInner(){
            int num = 30;//内部类方法的局部变量
            System.out.println(num);//局部变量，就近原则
            System.out.println(this.num);//内部类的成员变量
            System.out.println(Outer.this.num);//外部类的成员变量
        }
    }
}
