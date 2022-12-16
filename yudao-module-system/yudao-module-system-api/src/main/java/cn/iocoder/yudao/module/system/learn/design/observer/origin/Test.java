package cn.iocoder.yudao.module.system.learn.design.observer.origin;

/**
 * @author YS
 * @date 2022/12/16 11:51
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        //创建目标
        ConcerateSubject concerateSubject = new ConcerateSubject();
        //创建观察者
        ConcerateObserver concerateObserver = new ConcerateObserver();
        ConcerateObserver02 concerateObserver02 = new ConcerateObserver02();
        ConcerateObserver03 concerateObserver03 = new ConcerateObserver03();
        //注册观察者
        concerateSubject.attach(concerateObserver);
        concerateSubject.attach(concerateObserver02);
        concerateSubject.attach(concerateObserver03);
        //目标发布消息
        concerateSubject.notify("hello");
    }
}
