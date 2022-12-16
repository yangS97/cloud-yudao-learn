package cn.iocoder.yudao.module.system.learn.design.observer.again02.event;

import cn.hutool.json.JSONUtil;

/**
 * @author YS
 * @date 2022/12/16 16:51
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109876");
        System.out.println("测试结果  "+ JSONUtil.toJsonPrettyStr(result));
    }
}
