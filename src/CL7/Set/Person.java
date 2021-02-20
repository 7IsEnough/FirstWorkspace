package CL7.Set;

import java.util.Objects;

/**
 * @author Promise
 * @create 2019-08-03-11:00
 */
public class Person implements Comparable<Person>{
    //重写HashCode方法
//
//    @Override
//    public int hashCode() {
//        return 1;
//    }

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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


    //重写排序的规则
    @Override
    public int compareTo(Person o) {
//        return 0;//返回0就认为元素都是相同的
        //自定义比较的规则,比较2个人的年龄(this,参数Person)
        return this.getAge()-o.getAge();//年龄升序排序
    }
}
