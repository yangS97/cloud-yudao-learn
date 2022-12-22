package cn.iocoder.yudao.module.system.learn.design.observer.origin;

/**
 * @author YS
 * @date 2022/12/16 11:36
 * @Description 观察者
 */
public interface Observer {

    /**
     * 更新
     * @param message
     */
    void update(String message);
}

