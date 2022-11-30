package cn.iocoder.yudao.module.system.learn.design.abstractFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author YS
 * @date 2022/11/30 21:13
 * @Description
 */
public class RedisUtil {
    private Map<String,String> map = new ConcurrentHashMap<>();

    public String get(String key){
        return map.get(key);
    }
    public void set(String key,String value){
        map.put(key,value);
    }

    public void del(String key){
        map.remove(key);
    }
}
