package cn.iocoder.yudao.module.system.learn.design.strategy;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:20
 * @Description
 */
public class NYDiscount implements IDiscount<Double>{
    @Override
    public BigDecimal discountAmount(Double discount, BigDecimal skuPrice) {
        return new BigDecimal(discount);
    }
}
