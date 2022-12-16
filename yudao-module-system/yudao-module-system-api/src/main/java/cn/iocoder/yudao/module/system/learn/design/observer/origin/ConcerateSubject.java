package cn.iocoder.yudao.module.system.learn.design.observer.origin;

/**
 * @author YS
 * @date 2022/12/16 11:49
 * @Description 具体被观察者类
 */
public class ConcerateSubject extends Subject {

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
