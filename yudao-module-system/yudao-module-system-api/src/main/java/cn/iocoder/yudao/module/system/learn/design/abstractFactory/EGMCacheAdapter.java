package cn.iocoder.yudao.module.system.learn.design.abstractFactory;

/**
 * @author YS
 * @date 2022/11/30 21:41
 * @Description
 */
public class EGMCacheAdapter implements ICacheAdapter{
    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key,value);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
