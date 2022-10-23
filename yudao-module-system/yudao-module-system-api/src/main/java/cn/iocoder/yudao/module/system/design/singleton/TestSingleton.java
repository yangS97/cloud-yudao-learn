package cn.iocoder.yudao.module.system.design.singleton;

/**
 * @author YS
 * @date 2022/10/23 15:46
 * @Description
 */
public class TestSingleton {
    public static void main(String[] args) {
        enumCase();
    }

    private static void enumCase() {
        EnumCase.INSTANCE.test();
    }


}
