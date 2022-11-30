package cn.iocoder.yudao.module.system.learn.design.sixPrinciple.singleDuty;

/**
 * @author YS
 * @date 2022/11/26 22:30
 * @Description 视频用户行为
 */
public class VideoUserService {
    public void serve(UserTypeEnum userTypeEnum) {
        if (userTypeEnum == UserTypeEnum.VISITOR_USER) {
            System.out.println("==========2000行代码逻辑========");
            System.out.println("游客用户: 播放480P视频, 有广告");
        } else if (userTypeEnum == UserTypeEnum.NORMAL_USER) {
            System.out.println("==========2000行代码逻辑========");
            System.out.println("普通用户: 播放720P视频, 有广告");
        } else if (userTypeEnum == UserTypeEnum.VIP_USER) {
            System.out.println("==========2000行代码逻辑========");
            System.out.println("VIP用户: 播放1080P视频, 无广告");
        }

    }

    public static void main(String[] args) {
        VideoUserService videoUserService = new VideoUserService();
        videoUserService.serve(UserTypeEnum.VISITOR_USER);
        videoUserService.serve(UserTypeEnum.NORMAL_USER);
        videoUserService.serve(UserTypeEnum.VIP_USER);
    }


}
