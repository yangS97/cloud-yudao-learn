package cn.iocoder.yudao.module.system.learn.design.strategy;

/**
 * @author YS
 * @date 2022/12/1 21:47
 * @Description
 */
public class DiscountService {
    public double discountAmount(int type,double typeContent, double skuPrice,double typeExt){
        //直减
        if(1==type){
            return skuPrice - typeContent;
        }
        //满减
        if(2==type){
            if(skuPrice < typeExt){
                return skuPrice;
            }
            return skuPrice - typeContent;
        }
        //折扣
        if(3==type){
            return skuPrice * typeContent;
        }
        //N元购
        if(4==type){
            return typeContent;
        }
        return 0D;
    }
}
