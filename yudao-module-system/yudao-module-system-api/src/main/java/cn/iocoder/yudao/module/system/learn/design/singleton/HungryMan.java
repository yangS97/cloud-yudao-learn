package cn.iocoder.yudao.module.system.learn.design.singleton;

/**
 * @author YS
 * @date 2022/10/23 16:41
 * @Description 饿汉式
 */
public class HungryMan {
    private HungryMan(){}
    private static final HungryMan INSTANCE = new HungryMan();
    public static HungryMan getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        testHungryMan();
    }

    private static void testHungryMan() {
        System.out.println("HungryMan.INSTANCE = " + HungryMan.INSTANCE);
        System.out.println("HungryMan.INSTANCE = " + HungryMan.INSTANCE);
    }
}
