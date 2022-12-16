package cn.iocoder.yudao.module.system.learn.design.observer.again;

/**
 * @author YS
 * @date 2022/12/16 14:46
 * @Description 抽象观察类
 */
public interface Observer {
    void setName(String name);
    String getName();
    void help();
    void beAttacked(AllyControlCenter acc);
}
