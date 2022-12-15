package cn.iocoder.yudao.module.system.learn.design.strategy.impl;

import cn.iocoder.yudao.module.system.learn.design.strategy.Discount;
import cn.iocoder.yudao.module.system.learn.design.strategy.Discount02;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:20
 * @Description
 */
@Component
@Slf4j
public class NYDiscount implements Discount<Double>, Discount02<Double> {
    @Override
    public BigDecimal discountAmount(Double discount, BigDecimal skuPrice) {
        return new BigDecimal(discount);
    }

    @Override
    public BigDecimal getDiscount(Double aDouble, BigDecimal skuPrice) {
        log.info("this is Context02 里面的 ny折扣方法");
        return new BigDecimal(aDouble);
    }
}
