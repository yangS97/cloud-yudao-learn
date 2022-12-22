package cn.iocoder.yudao.module.system.learn.design.observer.origin;

/**
 * @author YS
 * @date 2022/12/16 14:22
 * @Description 具体观察类3
 */
public class ConcerateObserver03 implements Observer{
    @Override
    public void update(String message) {
        System.out.println("具体观察类3收到消息：" + message);
    }
}
