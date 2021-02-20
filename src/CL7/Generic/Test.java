package CL7.Generic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Promise
 * @create 2019-08-02-10:08
 * 斗地主案例
 */
public class Test {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //先把大王和小王存储到poker中
        poker.add("大王");
        poker.add("小王");

        //循环嵌套遍历两个数组，组装52张牌
        for(String number:numbers){
            for(String color:colors){
//                System.out.println(color+number);
                //把组装好的牌存储到poker集合中
                poker.add(color+number);
            }
        }
//        System.out.println(poker);

        /*
        *2.洗牌
        * 使用集合的工具类Collections中的方法
        * static void shuffle(List<?> list)使用默认随机源对指定列表进行置换
        */
        Collections.shuffle(poker);
//        System.out.println(poker);

        /*
        *3.发牌
        */
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        /*
        *遍历poker集合，获取每一张牌
        * 使用poker集合的索引%3给3个玩家轮流发牌，剩余3张牌给底牌
        * 注意：先判断底牌(i>=51),否则牌就发没了
        *
        */
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String s = poker.get(i);
            //轮流发牌
            if(i>=51){
                //给底牌发牌
                diPai.add(s);
            } else if(i%3==0){
                //给玩家1发牌
                player1.add(s);
            } else if(i%3==1){
                //给玩家2发牌
                player2.add(s);
            } else if(i%3==2){
                //给玩家3发牌
                player3.add(s);
            }
        }

        /*
        *4.看牌
        */
        System.out.println("刘德华："+player1);
        System.out.println("周润发："+player2);
        System.out.println("周星驰："+player3);
        System.out.println("底牌："+diPai);
    }
}
