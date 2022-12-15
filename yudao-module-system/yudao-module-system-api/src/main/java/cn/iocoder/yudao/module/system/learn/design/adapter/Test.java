package cn.iocoder.yudao.module.system.learn.design.adapter;

/**
 * @author YS
 * @date 2022/12/15 14:52
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        Target target =  new Adapter(new Adaptee());
        target.request();
    }
}
