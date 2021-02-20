package CL7.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Promise
 * @create 2019-08-04-16:12
 */
public class Demo9Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

        //public static <T> void sort(List<T> list,Comparator<? super T>)
        //将集合按照指定规则排序
        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1-o2;//升序
                return o2-o1;//降序

            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("明凯",26));
        list02.add(new Student("简自豪",23));
        list02.add(new Student("a严君泽",24));
        list02.add(new Student("b明凯",24));
        System.out.println(list02);

/*        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排序
                return o1.getAge()-o2.getAge();
            }
        });*/

        //扩展
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排序
                int result =  o1.getAge()-o2.getAge();
                //如果两个人年龄相同，再使用姓名的第一个字比较
                if(result==0){
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);
    }
}
