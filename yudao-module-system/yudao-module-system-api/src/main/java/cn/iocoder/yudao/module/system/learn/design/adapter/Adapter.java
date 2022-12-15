package cn.iocoder.yudao.module.system.learn.design.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YS
 * @date 2022/12/15 14:50
 * @Description 适配器
 */
@Slf4j
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        log.info("this is a adapter request");
        adaptee.oldRequest();
    }
}
