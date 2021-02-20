import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-04-26-15:55
 */
public class TemplatesTest {

    //模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println(1);
        //变形：soutp(输出形参) / soutm(输出方法名) / soutv(就近选择输出变量值) / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num1= 10;
        //soutv
        System.out.println("num1 = " + num1);
        //num1.sout
        System.out.println(num1);


        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            //arr[i].sout
            System.out.println(arr[i]);

        }
        //变形：iter(增强for循环)
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar(普通for循环)
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板4：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }
        //变形：list.fori(顺序遍历)
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr(逆序遍历)
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //模板5：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {
            
        }
        //变形：xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }
    //模板6：prsf(可生成private static final)
    private static final first cust = new first();

    //变形：psf / psfi / psfs
    public static final first Num = new first();
    public static final int Num1 = 1;
    public static final String Nation = "";


}
