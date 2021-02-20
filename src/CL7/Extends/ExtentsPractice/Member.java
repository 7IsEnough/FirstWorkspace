package CL7.Extends.ExtentsPractice;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Promise
 * @create 2019-07-24-10:52
 */
//普通成员
public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随机抽取一个
        //随机获取一个集合中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且将得到被删除的红包给自己
        int delta = list.remove(index);
        //获取当前成员的余额
        int money = super.getMoney();
        //将得到的红包加入余额，重新设置余额值
        super.setMoney(money + delta);
    }
}
