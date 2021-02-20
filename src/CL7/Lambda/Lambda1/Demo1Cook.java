package CL7.Lambda.Lambda1;

/**
 * @author Promise
 * @create 2019-08-14-14:43
 */
public class Demo1Cook {
    public static void main(String[] args) {
        //调用invokeCook方法，参数为Cook方法，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //使用Lambda表达式，简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("吃饭了");
        });

        //优化Lambda表达式(省略{}，;)
        invokeCook(()-> System.out.println("吃饭了"));
    }
    //定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
