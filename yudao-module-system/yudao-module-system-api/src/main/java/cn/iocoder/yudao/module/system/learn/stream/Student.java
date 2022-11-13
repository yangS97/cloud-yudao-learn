package cn.iocoder.yudao.module.system.learn.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author YS
 * @date 2022/11/12 22:47
 * @Description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Student {
    private String name;
    private Integer age;
}
