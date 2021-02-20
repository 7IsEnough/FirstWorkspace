package CL7.ArrayList.ArrayListPractice;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-22-19:07
 * 自定义4个学生对象，添加到集合，并遍历
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("明凯",26);
        Student two = new Student("简自豪",23);
        Student three = new Student("伊芙琳",8);
        Student four = new Student("薇恩",9);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+" 年龄："+stu.getAge());
            
        }
    }
}
