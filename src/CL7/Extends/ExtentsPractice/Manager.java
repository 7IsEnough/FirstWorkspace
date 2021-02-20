package CL7.Extends.ExtentsPractice;

import java.util.ArrayList;

/**
 * @author Promise
 * @create 2019-07-24-10:38
 */
//群主的类
public class Manager extends User {
    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //需要一个集合，用来存储若干红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看群主自己有多少钱
        int leftMoney = super.getMoney();//群主当前的余额
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;//空集合
        }

        //扣钱,其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成count份
        int avg = totalMoney/count;
        int mod = totalMoney%count; //余数，剩下的零头
        //除不开的零头，包在最后一个红包中
        //把红包一个一个放到集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }

}
