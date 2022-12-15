package cn.iocoder.yudao.module.system.learn.design.strategy;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:18
 * @Description
 */
public class ZKDiscount implements IDiscount<Double>{
    @Override
    public BigDecimal discountAmount(Double discounts, BigDecimal skuPrice) {
        return skuPrice.multiply(new BigDecimal(discounts));
    }
}
