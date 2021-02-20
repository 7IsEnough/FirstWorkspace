package CL7.MethodReference.ConsturctorMethodReference;

/**
 * @author Promise
 * @create 2019-08-23-10:15
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
