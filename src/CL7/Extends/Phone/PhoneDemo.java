package CL7.Extends.Phone;

/**
 * @author Promise
 * @create 2019-07-23-16:36
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.call();
        phone.send();
        phone.show();
        System.out.println("==========");

        newPhone newPhone = new newPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
