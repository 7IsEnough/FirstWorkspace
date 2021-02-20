package CL7.File.Recursion;

/**
 * @author Promise
 * @create 2019-08-15-13:39
 */
public class Demo1Recurison {
    public static void main(String[] args) {
//        a();
        b(1);
    }
    public Demo1Recurison(){
//        Demo1Recurison();//直接编译报错
        //构造方法一直递归会导致内存中有无数个对象
    }

    private static void b(int i) {
        System.out.println(i);
        if(i==20000){//递归次数不能太多，否则也会发生栈内存溢出
            return;//结束方法
        }
    }

    private static void a() {
        System.out.println("a方法");
        a();
    }
}
