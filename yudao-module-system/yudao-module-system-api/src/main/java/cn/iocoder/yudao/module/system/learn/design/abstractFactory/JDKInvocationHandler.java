package cn.iocoder.yudao.module.system.learn.design.abstractFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author YS
 * @date 2022/11/30 21:50
 * @Description
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter adapter;

    public JDKInvocationHandler(ICacheAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(adapter,args);
    }
}
