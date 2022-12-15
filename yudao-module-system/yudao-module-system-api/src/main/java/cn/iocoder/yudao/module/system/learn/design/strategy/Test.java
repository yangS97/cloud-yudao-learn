package cn.iocoder.yudao.module.system.learn.design.strategy;

import cn.hutool.core.convert.Convert;
import cn.iocoder.yudao.module.system.learn.design.strategy.impl.NYDiscount;
import cn.iocoder.yudao.module.system.learn.design.strategy.impl.ZJDiscount;
import cn.iocoder.yudao.module.system.learn.design.strategy.impl.ZKDiscount;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:33
 * @Description
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        //test();
        //test02();
        testContext02();
    }

    private static void testContext02() {
        Context02<Double> context02 = new Context02<>(new NYDiscount());
        BigDecimal price = context02.getDiscount(100d, Convert.toBigDecimal(100));
        log.info("price=="+price);
    }

    private static void test02() {
        Context<Double> context = new Context<>(new ZKDiscount());
        BigDecimal result = context.discountAmount(0.5, new BigDecimal(100));
        log.info("result:{}",result);
    }

    private static void test() {
        Context<Double> doubleContext = new Context<>(new ZJDiscount());
        BigDecimal result = doubleContext.discountAmount(0.8, new BigDecimal(100));
        log.info("result:{}", result);
    }

}
