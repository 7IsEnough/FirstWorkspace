package CL7.Final;

/**
 * @author Promise
 * @create 2019-07-26-14:54
 */
public class Person {
    private final String name /*= "明凯"*/;

    public Person() {
        name = "明凯";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
