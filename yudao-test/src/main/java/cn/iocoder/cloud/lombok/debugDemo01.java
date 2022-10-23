package cn.iocoder.cloud.lombok;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YS
 * @date 2022/7/9 17:33
 * @Description lombok的log使用测试
 */
@Slf4j
public class debugDemo01 {
    public static void main(String[] args) {
    //     测试不出来
        log.info("this is a info");
        log.error("this is a error");
        log.debug("this is a debug");
    }
}
