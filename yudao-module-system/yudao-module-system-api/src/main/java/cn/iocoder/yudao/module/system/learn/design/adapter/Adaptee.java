package cn.iocoder.yudao.module.system.learn.design.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YS
 * @date 2022/12/15 14:48
 * @Description 被适配者
 */
@Slf4j
public class Adaptee {
    public void oldRequest(){
      log.info("this is old request");
    }
}
