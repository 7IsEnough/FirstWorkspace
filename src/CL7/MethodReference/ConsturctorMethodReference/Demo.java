package CL7.MethodReference.ConsturctorMethodReference;

/**
 * @author Promise
 * @create 2019-08-23-10:18
 * 类的构造器引用
 */
public class Demo {
    public static void main(String[] args) {
        //调用printName方法，参数传递Lambda表达式
//        printName("明凯",(String name)->{
//            return new Person(name);
//        });

        printName("明凯",Person::new);

    }
    //定义一个方法，参数传递姓名和PersonBuilder接口，方法中通过姓名创建Person对象
    public static void printName(String name,PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }
}
