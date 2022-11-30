package cn.iocoder.yudao.module.system.learn.design.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YS
 * @date 2022/11/30 22:27
 * @Description
 */
@Slf4j
public class NewTest {
    public static void main(String[] args) throws Exception {
        test();
    }

    private static void test() throws Exception {
        CacheService proxy_EGM = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy_EGM.set("user_name_01", "ys");
        String val01 = proxy_EGM.get("user_name_01");
        log.info("缓存服务 EGM测试结果：{}", val01);
        CacheService proxy_iir = JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);
        proxy_iir.set("user_name_02", "gsr");
        String val02 = proxy_iir.get("user_name_02");
        log.info("缓存服务 IIR测试结果：{}", val02);
    }
}
