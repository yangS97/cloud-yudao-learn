package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author YS
 * @date 2022/10/23 14:24
 * @Description 审核entity类
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class AuthInfo {
    private String code;
    private String info = "";


    public AuthInfo(String code, String ...infos) {
        this.code = code;
        for (String info : infos) {
            this.info = this.info.concat(info);
        }
    }
}
