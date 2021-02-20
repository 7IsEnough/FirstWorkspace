package CL7.Set;

/**
 * @author Promise
 * @create 2019-08-04-13:57
 * 可变参数
 */
public class Demo6VarArgs {
    public static void main(String[] args) {

//        int i = add();
//        int i = add(10);
        int i = add(10,20);
        System.out.println(i);
        method("abc",8.8,1,2,3,4);

    }
//    //定义一个方法，计算两个int类型整数的和
//    public static int add(int a,int b){
//        return a+b;
//    }
//
//    //定义一个方法，计算三个int类型整数的和
//    public static int add(int a,int b,int c){
//        return a+b+c;
//    }

    /*
    *定义计算(0-n)个整数和的方法
    * 已知：计算整数的和，数据类型已经确定int
    * 但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
    * add():就会创建一个长度为0的数组,new int[0]
    * add(10):就会创建一个长度为1的数组,存储传递过来的参数new int[]{10}
    * add(10,20):就会创建一个长度为2的数组,存储传递过来的参数new int[]{10,20}
    */
    public static int add(int...arr){
//        System.out.println(arr);//底层为数组
//        System.out.println(arr.length);

        //定义初始化变量，记录累加求和
        int sum = 0;
        //遍历数组
        for (int i : arr) {
            sum+=i;
        }
        //求和结果返回
        return sum;
    }

//    public static void method(int...a,String...b){}   错误，一个方法只能有一个可变参数
//    public static void method(int...a,String b,double c){}   错误，一个方法的可变参数只能写在末尾
    public static void method(String b,double c,int...a){//正确写法

    }
    //可变参数的特殊(终极)写法
    public void method01(Object...obj){//可以接收任意数据类型参数

    }


}
