package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.kaibi;

/**
 * 计算面积
 *
 * @author YS
 * @date 2022/11/26 22:05
 * @Description
 */
public class CalaulatedAreaImpl implements ICalculatedArea{
    public static final  double t = 3.14d;

    @Override
    public double rectangle(double x, double y) {
        return 0;
    }

    @Override
    public double triangle(double x, double y) {
        return 0;
    }

    @Override
    public double circular(double radius) {
        return t * radius * radius;
    }
}
