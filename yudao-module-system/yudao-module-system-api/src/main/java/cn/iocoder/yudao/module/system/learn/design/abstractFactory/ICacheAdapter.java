package cn.iocoder.yudao.module.system.learn.design.abstractFactory;

/**
 * @author YS
 * @date 2022/11/30 21:40
 * @Description
 */
public interface ICacheAdapter {
    String get(String key);
    void set(String key, String value);
    void del(String key);
}
