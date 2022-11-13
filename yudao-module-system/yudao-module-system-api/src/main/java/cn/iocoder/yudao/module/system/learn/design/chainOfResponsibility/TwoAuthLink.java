package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility;

import java.util.Date;

/**
 * @author YS
 * @date 2022/10/23 15:04
 * @Description 具体的审核类
 */
public class TwoAuthLink extends AuthLink{
    public TwoAuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.getAuthInfo(levelUserId, orderId);
        if(null == date){
            return new AuthInfo("0001", "单号：", orderId, " 状态：待二级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：",f.format(date) , " 审批人：", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }
}
