package CL7.Object;

import java.util.Objects;

/**
 * @author Promise
 * @create 2019-07-29-20:41
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return name+" "+age;
//    }


//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


//    @Override
//    public boolean equals(Object obj) {
//        //增加判断，传递的参数obj如果是null，直接返回false
//        if(obj == null){
//            return false;
//        }
//        //增加判断，防止出现类转换异常
//        if(obj instanceof Person){
//            Person p = (Person) obj;
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//        //不是Person类型返回false
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass()是用反射技术判断o是否为Person类型  等效于 instanceof
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
