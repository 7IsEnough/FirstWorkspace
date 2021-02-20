package CL7.Final;

/**
 * @author Promise
 * @create 2019-07-26-10:16
 */
public class Demo1Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
        final int num2 = 200;
        System.out.println(num2);//200
//        num2 = 250;//错误写法，不能改变
//        num2 = 200;//错误写法

        //正确写法,只要保证有唯一一次正确赋值即可
        final int num3;
        num3 = 30;

        //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变

        Student stu1 = new Student("明凯");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("简自豪");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("===============");

        final Student stu2 = new Student("Clearlove");
        System.out.println(stu2.getName());
        //错误写法，final的引用类型变量，其中的地址不可改变
//        stu2 = new Student("Uzi");
        stu2.setName("Uzi");
        System.out.println(stu2.getName());

    }
}
