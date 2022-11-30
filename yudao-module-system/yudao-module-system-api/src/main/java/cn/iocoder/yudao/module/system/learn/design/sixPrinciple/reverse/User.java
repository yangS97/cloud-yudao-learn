package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.reverse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author YS
 * @date 2022/11/27 1:09
 * @Description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User {
    private String name;
    private Integer weight;
}
