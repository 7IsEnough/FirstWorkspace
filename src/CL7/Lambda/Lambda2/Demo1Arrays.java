package CL7.Lambda.Lambda2;

import java.util.Arrays;

/**
 * @author Promise
 * @create 2019-08-14-14:53
 */
public class Demo1Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("明凯",26),
                new Person("简自豪",23),
                new Person("严君泽",24),
        };
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序(前边-后边)排序
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        //使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        //优化Lambda表达式(省略return,;,{},Person)
        Arrays.sort(arr,( o1, o2)-> o1.getAge()-o2.getAge());

        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
