package cn.iocoder.cloud.test;

/**
 * @author YS
 * @date 2022/7/7 9:02
 * @Description 各种随意的测试
 */
public class TestDemo01 {
    public static void main(String[] args) {
        int i ;
        //就是验证一下, 方法传参的时候,里面可以传入表达式,之前从来没有用过
        test01(1,i= Math.abs(2));
    }

    private static void test01(int a, int b) {
        System.out.println(a + b);
    }
}
