public class first{
    /**
     * 全局变量可以
     */
    private static int asd =1;

    public static void main(String args[]){
        System.out.println("Hello,World");


        /**
         * 局部变量不行
         */
        int a=asd;

        System.out.println(asd);
        method();
        String s = new String();

    }
    /**
     * 方法说明
     */
    public static void method(){
        //这是单行注释
        /*区域注释*/


    }

}