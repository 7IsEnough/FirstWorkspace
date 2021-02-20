package CL7.MethodReference.ConsturctorMethodReference;

/**
 * @author Promise
 * @create 2019-08-23-10:16
 * 定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法，根据传递的姓名，创建Person对象并返回
    public abstract Person builderPerson(String name);
}
