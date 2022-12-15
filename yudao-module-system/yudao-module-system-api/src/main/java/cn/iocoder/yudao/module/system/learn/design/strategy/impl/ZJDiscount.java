package cn.iocoder.yudao.module.system.learn.design.strategy.impl;

import cn.iocoder.yudao.module.system.learn.design.strategy.Discount;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:01
 * @Description
 */
@Component
public class ZJDiscount implements Discount<Double> {

    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountamount = skuPrice.subtract(BigDecimal.valueOf(couponInfo));
        if(discountamount.compareTo(BigDecimal.ZERO) < 0){
            return BigDecimal.ZERO;
        }
        return discountamount;
    }
}
