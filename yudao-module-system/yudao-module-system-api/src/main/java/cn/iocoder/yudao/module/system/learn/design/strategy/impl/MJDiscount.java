package cn.iocoder.yudao.module.system.learn.design.strategy.impl;

import cn.hutool.core.convert.Convert;
import cn.iocoder.yudao.module.system.learn.design.strategy.Discount;
import cn.iocoder.yudao.module.system.learn.design.strategy.Discount02;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author YS
 * @date 2022/12/1 22:13
 * @Description
 */
@Component
@Slf4j
public class MJDiscount implements Discount<Map<String,String>>,Discount02<Map<String,String>> {
    @Override
    public BigDecimal discountAmount(Map<String,String> coupon, BigDecimal skuPrice) {
        String m = coupon.get("m");
        String j = coupon.get("j");
        if(skuPrice.compareTo(new BigDecimal(m))>0){
            return skuPrice.subtract(Convert.toBigDecimal("m"))  ;
        }
        log.info("this is mj discount");
        return skuPrice;
    }

    @Override
    public BigDecimal getDiscount(Map<String, String> stringStringMap, BigDecimal skuPrice) {
        String m = stringStringMap.get("m");
        String j = stringStringMap.get("j");
        if(skuPrice.compareTo(new BigDecimal(m))>0){
            return skuPrice.subtract(Convert.toBigDecimal("m"))  ;
        }
        log.info("this is mj discount");
        return skuPrice;
    }
}
