package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.reverse;

import java.util.List;

/**
 * @author YS
 * @date 2022/11/27 1:10
 * @Description 抽奖实现
 */
public class lotteryControl {

    //随机抽奖
    public List<User> randomLottery(List<User> users, int count) {
        System.out.println("此处逻辑代码100行");
        return null;
    }


    //权重抽奖
    public List<User> weightLottery(List<User> users, int count) {
        System.out.println("此处逻辑代码200行");
        return null;
    }

    //测试
    /**
     * 坏处:
     * 1.如果一直拓展, 类代码量会越来越大, 不利于维护, 就像账单一样, 几千行
     * 2.每次拓展的时候, 不仅这边需要新增方法, 调用方也是一样,需要新增调用的方法,直接改代码了属于是违反了开闭原则
     * @param args
     */
    public static void main(String[] args) {
        lotteryControl lotteryControl = new lotteryControl();
        lotteryControl.randomLottery(null, 0);
        lotteryControl.weightLottery(null, 0);
    }
}
