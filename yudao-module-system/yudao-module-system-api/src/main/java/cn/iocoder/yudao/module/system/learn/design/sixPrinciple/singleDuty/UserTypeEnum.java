package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.singleDuty;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author YS
 * @date 2022/11/26 22:31
 * @Description 用户类型
 */
@AllArgsConstructor
@Getter
public enum UserTypeEnum {
    VISITOR_USER(1, "游客用户"),
    /**
     * 普通用户
     */
    NORMAL_USER(2, "普通用户"),
    /**
     * VIP用户
     */
    VIP_USER(3, "VIP用户");
    private final Integer type;
    private final String name;
}
