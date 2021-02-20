package CL7.annotation;

/**
 * @author Promise
 * @create 2019-08-23-21:04
 */
public @interface MyAnno {
    public abstract int age();
    public abstract String name() default "明凯";

//    public abstract String show2();
//    public abstract Person per();
//    public abstract MyAnno2 anno2();
//    public abstract String strs();
//    public abstract Worker w();


}
