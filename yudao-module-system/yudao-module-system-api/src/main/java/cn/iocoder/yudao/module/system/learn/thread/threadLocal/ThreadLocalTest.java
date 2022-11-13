package cn.iocoder.yudao.module.system.learn.thread.threadLocal;

/**
 * @author YS
 * @date 2022/10/29 12:52
 * @Description 测试threadLocal的使用
 */
public class ThreadLocalTest {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public static void main(String args[]) {
        threadLocal.set("正在主线程里面");
        System.out.println(Thread.currentThread().getName());

        new Thread(() -> {
            threadLocal.set("正在子线程a里面");
            System.out.println(Thread.currentThread().getName());
            System.out.println(threadLocal.get());
        }).start();

        new Thread(() -> {
            threadLocal.set("正在子线程b里面");
            System.out.println(Thread.currentThread().getName());
            System.out.println(threadLocal.get());
        }).start();
    }
}
