package cn.iocoder.yudao.module.system.design.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author YS
 * @date 2022/10/23 14:58
 * @Description 审核的抽象类
 */
@Slf4j
public  abstract class AuthLink {

    //级别人员id
    protected String levelUserId;
    //级别人员姓名
    protected String levelUserName;

    protected AuthLink next;

    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next(){
        return next;
    }

    public AuthLink appendNext(AuthLink next){
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date date);
}
