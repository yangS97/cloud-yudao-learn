package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.kaibi;

/**
 * @author YS
 * @date 2022/11/26 21:53
 * @Description 计算面积
 */
public interface ICalculatedArea {

    double rectangle(double x, double y);

    double triangle(double x, double y);

    double circular(double radius);
}
