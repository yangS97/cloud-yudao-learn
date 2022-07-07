package cn.iocoder.cloud.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author YS
 * @date 2022/7/7 8:32
 * @Description 测试可重入锁的意义:同一线程外层函数获得锁之后，内存递归函数仍然有获得该锁的代码，但是不受影响,指的是同一线程外层函数获得锁之后，内存递归函数仍然有获得该锁的代码，但是不受影响 避免死锁
 */
public class LockDemo01 implements Runnable {
    ReentrantLock lock =  new ReentrantLock();

    public void get(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getId());
            set();
        } finally {
            lock.unlock();
        }
    }

    public void set(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getId());

        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        get();
    }

    public static void main(String[] args) {
        //会发现:在get()方法获取到锁,还没有释放锁的时候,  内部调用的set()方法也会获取到锁,并执行, 不会发生死锁
        LockDemo01 demo01 = new LockDemo01();
        new Thread(demo01).start();
        new Thread(demo01).start();
        new Thread(demo01).start();
    }
}
