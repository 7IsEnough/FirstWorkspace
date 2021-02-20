package CL7.Exception.MyException;

/**
 * @author Promise
 * @create 2019-08-09-10:26
 * 自定义异常类
 */
public class RegisterException extends RuntimeException{
    //添加一个空参数的构造方法
    public RegisterException() {
        super();
    }
    /*
    * 添加一个带异常信息的构造方法
    * 所有的异常类都会有一个带异常信息的构造方法
    * 方法内部会调用父类带异常信息的构造方法，让父类来处理这个异常信息
    */

    public RegisterException(String message) {
        super(message);
    }
}
