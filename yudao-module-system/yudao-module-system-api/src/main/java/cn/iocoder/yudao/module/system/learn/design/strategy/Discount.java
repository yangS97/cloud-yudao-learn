package cn.iocoder.yudao.module.system.learn.design.strategy;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:00
 * @Description
 */
public interface Discount<T> {
    BigDecimal discountAmount(T couponInfo,BigDecimal skuPrice);
}
