package CL7.MethodReference.SuperMethodReference;

/**
 * @author Promise
 * @create 2019-08-23-9:31
 * 定义子类
 */
public class Man extends Human{
    public static void main(String[] args) {
        //创建Man对象调用show方法
        new Man().show();
    }
    @Override
    public void sayHello() {
        System.out.println("Hello,我是Man");
    }

    //定义一个方法参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用method方法，方法的参数是一个函数式接口，所以可以传递Lambda表达式
//        method(()->{
//            //创建父类对象
//            Human h = new Human();
//            //调用父类的方法
//            h.sayHello();
//        });


//        //有子父类关系，直接使用super调用父类的成员方法
//        method(()->{
//            super.sayHello();
//        });

        //使用super引用成员方法
        method(super::sayHello);

    }

}

