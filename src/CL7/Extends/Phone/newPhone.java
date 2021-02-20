package CL7.Extends.Phone;

/**
 * @author Promise
 * @create 2019-07-23-16:34
 */
public class newPhone extends Phone{

    @Override
    public void show() {
        super.show();//把父类的show方法拿过来重复利用
        //自己子类再来添加更多内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
