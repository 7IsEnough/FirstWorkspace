package CL7.annotation;

/**
 * @author Promise
 * @create 2019-08-23-20:54
 */
@SuppressWarnings("all")
public class Demo1Annotation {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }


    public void show2(){
        //替代show1
    }
    public void demo(){
        show1();

    }
}
