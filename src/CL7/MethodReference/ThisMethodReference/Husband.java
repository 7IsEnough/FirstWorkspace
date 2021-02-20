package CL7.MethodReference.ThisMethodReference;

/**
 * @author Promise
 * @create 2019-08-23-10:00
 * 通过this引用本类的成员方法
 */
public class Husband {
    public static void main(String[] args) {
        new Husband().soHappy();
    }
    //定义一个买房子的方法
    public void buyHouse(){
        System.out.println("北京二环内买一套四合院");
    }
    //定义一个结婚的方法，参数传递Richable接口
    public void marry(Richable r){
        r.buy();
    }
    //定义一个非常高兴的方法
    public void soHappy(){
//        //调用结婚的方法，传递Lambda表达式
//        marry(()->{
//            this.buyHouse();
//        });

        //使用方法引用
        marry(this::buyHouse);
    }
}
