package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.reverse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;

/**
 * @author YS
 * @date 2022/11/27 1:23
 * @Description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class lotteryControl02 {
    /**
     * 依赖倒置-抽象传递
     */
    private Lottery lottery;

    public List<User> lottery(Lottery lottery, List<User> users, int count) {
        return lottery.lottery(users, count);
    }


    /**
     * 测试:  依赖倒置-抽象传递      真是非常的巧妙
     * @param args
     */
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User());
        lotteryControl02 lotteryControl02 = new lotteryControl02();
        lotteryControl02.lottery(new RandomLottery(),users,2);
    }
}
