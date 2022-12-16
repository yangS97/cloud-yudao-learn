package cn.iocoder.yudao.module.system.learn.design.observer.origin;

/**
 * @author YS
 * @date 2022/12/16 11:51
 * @Description 具体观察类1
 */
public class ConcerateObserver02 implements Observer{
    @Override
    public void update(String message) {
        System.out.println("具体观察类2收到消息：" + message);
    }
}
