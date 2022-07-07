package cn.iocoder.cloud.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author YS
 * @date 2022/7/7 8:50
 * @Description
 */
public class CurrentHashMapDemo01 {
    public static void main(String[] args) {
        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>();
        //并发的hashmap, 即ConcurrentHashMap中,如果put的key或者value为null, 则会抛出NullPointerException异常
        map.put("1", null);
        System.out.println(map.get("1"));
    }
}
