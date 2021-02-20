package CL7.Exception;

/**
 * @author Promise
 * @create 2019-08-07-16:50
 */
public class Demo1Exception {
    public static void main(String[] args) /*throws ParseException */{
        //Exception:编译器异常，进行编译(写代码)java程序出现的问题
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
//        Date date = null;//把字符串格式的日期，解析为Date格式的日期
//        try {
//            date = sdf.parse("1999-0909");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);


        //RuntimeException：运行期异常，java程序运行过程中出现的问题
//        int[] arr = {1,2,3};
//        try {
//            //可能会出现异常的代码
//            System.out.println(arr[3]);
//        }catch (Exception e){
//            //异常的处理逻辑
//            System.out.println(e);
//        }

        /*
        *  Error：错误
        *  OutOfMemoryError: Java heap space
        *  内存溢出错误，创建的数组太大了，超出了给JVM分配的内存
        */
//        int[] arr = new int[1024*1024*1024];
        //必须修改代码，创建的数组小一点
        int[] arr = new int[1024*1024];

        System.out.println("后续代码");
    }
}
