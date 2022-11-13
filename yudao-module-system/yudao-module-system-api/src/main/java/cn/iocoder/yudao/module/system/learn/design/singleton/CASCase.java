package cn.iocoder.yudao.module.system.learn.design.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author YS
 * @date 2022/10/23 16:29
 * @Description cas实现方式
 */
public class CASCase {
    private static CASCase instance;
    private CASCase(){

    }
    private static final AtomicReference<CASCase> INSTANCE =  new AtomicReference<CASCase>();

    public static CASCase getInstance(){
        for(;;){
            CASCase instance = INSTANCE.get();
            if(null != instance){
                return instance;
            }
            instance = new CASCase();
            if(INSTANCE.compareAndSet(null, instance)){
                return instance;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("CASCase.getInstance() = " + CASCase.getInstance());
        System.out.println("CASCase.getInstance() = " + CASCase.getInstance());

    }
}
