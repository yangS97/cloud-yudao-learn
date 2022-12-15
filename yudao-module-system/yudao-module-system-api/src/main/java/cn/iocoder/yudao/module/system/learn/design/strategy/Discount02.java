package cn.iocoder.yudao.module.system.learn.design.strategy;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/15 13:55
 * @Description
 */
public interface Discount02<T> {
    BigDecimal getDiscount(T t, BigDecimal skuPrice);
}
