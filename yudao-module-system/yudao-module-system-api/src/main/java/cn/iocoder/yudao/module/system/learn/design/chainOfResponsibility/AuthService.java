package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility;

import cn.hutool.core.date.DateUtil;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author YS
 * @date 2022/10/23 14:00
 * @Description 责任链-模拟618大促
 * 1. 模拟审核流程
 * 2. 查询审核时间
 */
public class AuthService {

    private static ConcurrentHashMap<String, Date> authMap =  new ConcurrentHashMap<String, Date>();


    /**
     * 审核
     */
    public static void auth(String uId,String orderId){
        authMap.put(uId.concat(orderId), DateUtil.date());
    }


    /**
     * 获取审核结果
     *
     * @param uId     u id
     * @param orderId 订单id
     * @return {@link Date}
     */
    public static Date getAuthInfo(String uId,String orderId){
        return authMap.get(uId.concat(orderId));
    }

}
