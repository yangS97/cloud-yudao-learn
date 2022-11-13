package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author YS
 * @date 2022/10/23 15:18
 * @Description 测试优化后的责任链写法!
 */
@Slf4j
public class TestOptimization {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        AuthLink authLink = new ThreeAuthLink("003", "艳姐")
                .appendNext(new TwoAuthLink("002", "张哥"))
                .appendNext(new OneAuthLink("001", "吴总"));

        log.info("测试结果: {}", JSONUtil.toJsonPrettyStr(authLink.doAuth("睿智","2304823908423908490",new Date())));

        String s = "2022-06-18";
        DateTime date = DateUtil.parse(s, "yyyy-MM-dd");
        AuthService.auth("003","2304823908423908490");
        log.info("测试结果: {}", JSONUtil.toJsonPrettyStr(authLink.doAuth("睿智","2304823908423908490",new Date())));
    }
}
