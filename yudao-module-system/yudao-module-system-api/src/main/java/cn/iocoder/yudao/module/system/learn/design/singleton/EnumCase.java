package cn.iocoder.yudao.module.system.learn.design.singleton;

/**
 * @author YS
 * @date 2022/10/23 15:45
 * @Description 枚举实现单例
 */
public enum EnumCase {
    INSTANCE;
    public void test(){
        System.out.println("~HI");
    }


    public static void main(String[] args) {
            EnumCase.INSTANCE.test();
    }
}
