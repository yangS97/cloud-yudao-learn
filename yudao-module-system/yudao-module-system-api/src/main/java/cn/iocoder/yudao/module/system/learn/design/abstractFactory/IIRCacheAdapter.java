package cn.iocoder.yudao.module.system.learn.design.abstractFactory;

/**
 * @author YS
 * @date 2022/11/30 21:42
 * @Description
 */
public class IIRCacheAdapter implements ICacheAdapter{
    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key,value);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
