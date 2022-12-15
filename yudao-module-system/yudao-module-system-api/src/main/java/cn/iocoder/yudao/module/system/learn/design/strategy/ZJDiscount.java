package cn.iocoder.yudao.module.system.learn.design.strategy;

import java.math.BigDecimal;

/**
 * @author YS
 * @date 2022/12/1 22:01
 * @Description
 */
public class ZJDiscount implements IDiscount<Double>{

    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountamount = skuPrice.subtract(BigDecimal.valueOf(couponInfo));
        if(discountamount.compareTo(BigDecimal.ZERO) < 0){
            return BigDecimal.ZERO;
        }
        return discountamount;
    }
}
