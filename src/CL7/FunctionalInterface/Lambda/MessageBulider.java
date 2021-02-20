package CL7.FunctionalInterface.Lambda;

/**
 * @author Promise
 * @create 2019-08-21-21:40
 */
@FunctionalInterface
public interface MessageBulider {
   //定义一个拼接消息的抽象方法，返回被拼接的消息
    public abstract String builderMessage();
}
