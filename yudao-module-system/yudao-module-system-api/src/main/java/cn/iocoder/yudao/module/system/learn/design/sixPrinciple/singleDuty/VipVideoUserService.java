package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.singleDuty;

/**
 * @author YS
 * @date 2022/11/26 22:47
 * @Description Vip
 */
public class VipVideoUserService implements IVideoUserService {

    @Override
    public void videoResolution() {
        System.out.println("VIP用户: 处理成播放1080P视频的逻辑");
    }

    @Override
    public void videoAd() {
        System.out.println("里面是处理成没有广告的逻辑");
    }


    public static void main(String[] args) {
        VipVideoUserService vipVideoUserService = new VipVideoUserService();
        vipVideoUserService.videoResolution();
        vipVideoUserService.videoAd();
    }
}
