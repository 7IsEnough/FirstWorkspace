package CL7.ArrayList;

/**
 * @author Promise
 * @create 2019-07-22-15:34
 * 定义一个数组，用来存储3个Person对象
 */
public class DemoArray {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        System.out.println(array[0]);

        Person one = new Person("Vayne",25);
        Person two = new Person("Yasuo",23);
        Person three = new Person("lux",24);

        array[0] = one;//将one中的地址值赋值到数组的0号元素位置
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());

    }
}
