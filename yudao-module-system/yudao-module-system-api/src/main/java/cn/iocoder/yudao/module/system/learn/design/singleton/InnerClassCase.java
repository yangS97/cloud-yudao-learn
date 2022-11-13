package cn.iocoder.yudao.module.system.learn.design.singleton;

/**
 * @author YS
 * @date 2022/10/23 16:38
 * @Description 静态内部类实现方式
 */
public class InnerClassCase {
    private InnerClassCase(){}
    public static class InnerClassCaseHolder{
        private static final InnerClassCase INSTANCE = new InnerClassCase();
    }

    public static InnerClassCase getInstance(){
        return InnerClassCaseHolder.INSTANCE;
    }


    public static void main(String[] args) {
        testInnerClass();
    }

    private static void testInnerClass() {
        System.out.println("InnerClassCase.getInstance() = " + InnerClassCase.getInstance());
        System.out.println("InnerClassCase.getInstance() = " + InnerClassCase.getInstance());
    }
}
