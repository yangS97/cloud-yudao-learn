package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.kaibi;

/**
 * @author YS
 * @date 2022/11/26 22:08
 * @Description   这样子就实现了开闭原则:  通过继承或者实现吧, 达到拓展的效果,而不是直接修改修改源代码
 */
public class extCalaulatedAreaImpl extends CalaulatedAreaImpl{
    public static final  double t = 3.1415926535d;
    @Override
    public double circular(double radius) {
        return super.circular(radius);
    }
}
