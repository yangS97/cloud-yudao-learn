package cn.iocoder.yudao.module.system.learn.design.appearance;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YS
 * @date 2022/12/18 16:30
 * @Description
 */
@Slf4j
public enum TV {
    TV;
    public static TV getInstance() {
        return TV;
    }
    public  void on(){
      log.info("the TV is on!");
    }

    public  void off(){
        log.info("the TV is off!");
    }

    public  void dim(){
        log.info("the TV is dim!");
    }

    public  void bright(){
        log.info("the TV is bright!");
    }
}
