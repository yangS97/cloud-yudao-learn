package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjUtil;

import java.util.Date;

/**
 * @author YS
 * @date 2022/10/23 14:19
 * @Description 不使用责任链 -  简单版
 */
public class AuthSimpleController {

    /**
     * 执行审核
     *
     * @param uId      u id
     * @param orderId  订单id
     * @param authDate 认证日期
     */
    public  AuthInfo doAuth(String uId, String orderId, Date authDate){
        //三级审批
        Date date = AuthService.getAuthInfo("1000013", orderId);
        if(ObjUtil.isEmpty(date)){
            return new AuthInfo("0001","订单号",orderId," 状态:待三级审批负责人 ","唐浩");
        }
        //二级审批
        if(authDate.after(DateUtil.parse("2022-06-01")) && authDate.before(DateUtil.parse("2020-06-25 23:59:59"))){
            date = AuthService.getAuthInfo("1000012", orderId);
            if(ObjUtil.isEmpty(date)){
                return new AuthInfo("0001","订单号",orderId," 状态:待二级审批负责人 ","李思维");
            }
        }
        //一级审批
        if(authDate.after(DateUtil.parse("2022-06-11")) && authDate.before(DateUtil.parse("2020-06-25 23:59:59"))){
            date = AuthService.getAuthInfo("1000013", orderId);
            if(ObjUtil.isEmpty(date)){
                return new AuthInfo("0001","订单号",orderId," 状态:待一级审批负责人 ","杨帅");
            }
        }

        return new AuthInfo("0001", "单号：", orderId, " 状态：审批完成");
    }
}
