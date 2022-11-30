package cn.iocoder.yudao.module.system.learn.design.abstractFactory;

import java.lang.reflect.Proxy;

/**
 * @author YS
 * @date 2022/11/30 21:44
 * @Description
 */
public class JDKProxyFactory {
    public static <T> T getProxy(Class cacheClass, Class<? extends ICacheAdapter> cacheAdapter) throws Exception{
        JDKInvocationHandler handler = new JDKInvocationHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(classLoader,new Class[]{cacheClass},handler);
    }
}
