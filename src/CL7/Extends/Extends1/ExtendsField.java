package CL7.Extends.Extends1;

/**
 * @author Promise
 * @create 2019-07-23-15:08
 */
public class ExtendsField {
    public static void main(String[] args) {
        Fu fu =new Fu(); //创建父类对象
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类内容
        System.out.println("==============");

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("==============");


        //等号左边是谁，就优先用谁
        System.out.println(zi.num);
        System.out.println("==============");
//        System.out.println(zi.abc);//到处都没有，编译报错

        //这个方法是子类的，优先用子类的，没有再向上找
        zi.methodZi();
        //这个方法是父类中定义的，
        zi.methodFu();

    }
}
