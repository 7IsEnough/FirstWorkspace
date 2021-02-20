package CL7.Polymorphism.Practice;

/**
 * @author Promise
 * @create 2019-07-26-9:26
 */
//鼠标就是一个USB设备
public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
