package CL7.Extends;

/**
 * @author Promise
 * @create 2019-07-23-14:56
 */
public class DemoExtends {
    public static void main(String[] args) {
        //创建了一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类当中虽然什么都没写，但是会继承来自父类的method方法
        teacher.method();

        //创建另一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
