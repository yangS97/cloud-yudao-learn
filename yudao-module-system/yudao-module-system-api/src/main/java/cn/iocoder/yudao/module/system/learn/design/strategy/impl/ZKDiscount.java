package cn.iocoder.yudao.module.system.learn.design.strategy.impl;

import cn.iocoder.yudao.module.system.learn.design.strategy.Discount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:18
 * @Description
 */
@Component
@Slf4j
public class ZKDiscount implements Discount<Double> {
    @Override
    public BigDecimal discountAmount(Double discounts, BigDecimal skuPrice) {
        log.info("=====================this is zk discount");
        return skuPrice.multiply(new BigDecimal(discounts));
    }
}
