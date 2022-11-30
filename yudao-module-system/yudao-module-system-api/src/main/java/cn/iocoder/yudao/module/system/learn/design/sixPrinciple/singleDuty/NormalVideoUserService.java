package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.singleDuty;

/**
 * @author YS
 * @date 2022/11/26 22:47
 * @Description 普通用户
 */
public class NormalVideoUserService implements IVideoUserService {

    @Override
    public void videoResolution() {
        System.out.println("普通用户: 处理成播放720P视频的逻辑");
    }

    @Override
    public void videoAd() {
        System.out.println("里面是处理成有广告的逻辑");
    }
}
