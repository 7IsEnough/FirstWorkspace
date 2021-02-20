package CL7.Polymorphism.Practice;

/**
 * @author Promise
 * @create 2019-07-26-9:22
 */
public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    //使用设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();//打开设备
        if(usb instanceof Mouse){ //先判断
            Mouse mouse = (Mouse) usb; //向下转型
            mouse.click();
        } else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();//关闭设备
    }

}
