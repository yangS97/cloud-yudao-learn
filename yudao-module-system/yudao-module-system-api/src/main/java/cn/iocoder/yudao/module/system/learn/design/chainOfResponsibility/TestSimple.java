package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author YS
 * @date 2022/10/23 14:41
 * @Description 测试
 */
@Slf4j
public class TestSimple {
    public static void main(String[] args) {
        testSimple();
    }

    public static void testSimple(){
        AuthSimpleController auth = new AuthSimpleController();
        // 模拟三级负责人审批
        log.info("测试结果：{}", JSONUtil.toJsonPrettyStr(auth.doAuth("小傅哥", "1000998004813441", new Date())));
        log.info("测试结果：{}", "模拟三级负责人审批，唐浩");
        AuthService.auth("1000013", "1000998004813441");

        // 模拟二级负责人审批
        log.info("测试结果：{}", JSONUtil.toJsonPrettyStr(auth.doAuth("小傅哥", "1000998004813441", new Date())));
        log.info("测试结果：{}", "模拟二级负责人审批，李思维");
        AuthService.auth("1000012", "1000998004813441");

        // 模拟一级负责人审批
        log.info("测试结果：{}", JSONUtil.toJsonPrettyStr(auth.doAuth("小傅哥", "1000998004813441", new Date())));
        log.info("测试结果：{}", "模拟一级负责人审批，段总");
        AuthService.auth("1000011", "1000998004813441");

        log.info("测试结果：{}", "审批完成");
    }
}
