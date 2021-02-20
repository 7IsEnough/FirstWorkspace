package CL7.JUnit;

/**
 * @author Promise
 * @create 2019-08-23-10:53
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        System.out.println(result);

        result = c.sub(1,1);
        System.out.println(result);
    }
}
