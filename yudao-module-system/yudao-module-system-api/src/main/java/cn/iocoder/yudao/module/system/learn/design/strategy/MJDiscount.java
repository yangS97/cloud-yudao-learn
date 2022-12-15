package cn.iocoder.yudao.module.system.learn.design.strategy;

import cn.hutool.core.convert.Convert;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author YS
 * @date 2022/12/1 22:13
 * @Description
 */
public class MJDiscount implements IDiscount<Map<String,String>>{
    @Override
    public BigDecimal discountAmount(Map<String,String> coupon, BigDecimal skuPrice) {
        String m = coupon.get("m");
        String j = coupon.get("j");
        if(skuPrice.compareTo(new BigDecimal(m))>0){
            return skuPrice.subtract(Convert.toBigDecimal("m"))  ;
        }
        return skuPrice;
    }
}
