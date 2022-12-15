package cn.iocoder.yudao.module.system.learn.design.strategy;

import cn.iocoder.yudao.module.system.learn.design.strategy.impl.NYDiscount;
import org.springframework.beans.factory.InitializingBean;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/15 13:46
 * @Description 再次试验环境类
 */
public class Context02<T> implements InitializingBean {
    private Discount02<T> discount;

    public Context02(Discount02<T> discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount(T t, BigDecimal skuPrice){
        return  discount.getDiscount(t,skuPrice);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.discount = (Discount02<T>) new NYDiscount();
    }
}
