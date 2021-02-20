package CL7.InnerClass;

/**
 * @author Promise
 * @create 2019-07-26-16:53
 */
public class DemoiInnerClass {
    public static void main(String[] args) {
        Body body = new Body(); //外部类的对象
        //通过外部类的对象，调用外部类的方法，里面间接在使用内部类Heart
        body.methodBody();
        System.out.println("==============");

        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}
