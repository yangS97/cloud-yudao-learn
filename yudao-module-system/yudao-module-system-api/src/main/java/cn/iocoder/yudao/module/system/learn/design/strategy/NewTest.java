package cn.iocoder.yudao.module.system.learn.design.strategy;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:33
 * @Description
 */
@Slf4j
public class NewTest {
    public static void main(String[] args) {
        //test();
        test02();
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
