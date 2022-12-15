package cn.iocoder.yudao.module.system.learn.design.strategy;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:39
 * @Description
 */
public class Context<T> {
    private IDiscount<T> discount;

    public Context(IDiscount<T> discount) {
        this.discount = discount;
    }

    public BigDecimal discountAmount(T t, BigDecimal skuPrice){
        return discount.discountAmount(t,skuPrice);
    }


}
