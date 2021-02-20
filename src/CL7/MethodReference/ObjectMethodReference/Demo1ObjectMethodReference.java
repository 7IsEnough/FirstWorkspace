package CL7.MethodReference.ObjectMethodReference;

/**
 * @author Promise
 * @create 2019-08-22-21:42
 */
public class Demo1ObjectMethodReference {
    public static void main(String[] args) {
        printString((String s)->{
            //创建methodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            //调用成员方法
            obj.printUpperCaseString(s);
        });

        //使用方法引用优化
        //对象MethodRerObject,成员方法printUpperCaseString是已经存在的
        //可以使用对象名引用成员方法

        //创建methodRerObject对象
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
    //定义一个方法，参数传递Printable接口
    public static void printString(Printable p){
        p.print("Clearlove");
    }
}
