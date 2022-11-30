package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.reverse;

import java.util.List;

/**
 * @author YS
 * @date 2022/11/27 1:21
 * @Description 抽奖的抽象层
 */
public interface Lottery {

    List<User> lottery(List<User> users, int count);
}
