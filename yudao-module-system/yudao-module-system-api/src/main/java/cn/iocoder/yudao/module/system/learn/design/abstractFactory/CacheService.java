package cn.iocoder.yudao.module.system.learn.design.abstractFactory;

/**
 * @author YS
 * @date 2022/11/30 21:12
 * @Description
 */
public interface CacheService {

        /**
        * 获取缓存
        * @param key
        * @return
        */
        String get(String key);

        /**
        * 设置缓存
        * @param key
        * @param value
        */
        void set(String key, String value);

        /**
        * 删除缓存
        * @param key
        */
        void del(String key);
}
