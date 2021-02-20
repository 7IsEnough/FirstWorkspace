package CL7.Polymorphism.Practice;

/**
 * @author Promise
 * @create 2019-07-26-9:29
 */
public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用(使用多态,进行向上转型)
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//正确写法,也发生了向上转型
//        computer.useDevice(new Keyboard());//也是正确写法

        computer.powerOff();
        System.out.println("==============");

        method(10.0); //double -> double
        method(20); //int -> double
    }
    public static void method(double num){
        System.out.println(num);
    }
}
