package cn.iocoder.yudao.module.system.learn.design.appearance;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YS
 * @date 2022/12/18 16:30
 * @Description
 */
@Slf4j
public enum HouseLight {
    LIGHT;
    public static HouseLight getInstance() {
        return LIGHT;
    }
    public  void on(){
      log.info("the light is on!");
    }

    public  void off(){
        log.info("the light is off!");
    }

    public  void dim(){
        log.info("the light is dim!");
    }

    public  void bright(){
        log.info("the light is bright!");
    }
}
