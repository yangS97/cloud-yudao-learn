package cn.iocoder.yudao.module.system.learn.design.abstractFactory.again;

import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.factory.AbstractFactory;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.factory.impl.AliyunOssFactory;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.factory.impl.QiNiuYunOssFactory;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssVideo;

/**
 * @author YS
 * @date 2022/12/18 17:28
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        AbstractFactory factory = new AliyunOssFactory();
        OssVideo video = factory.updateVideo(null);
        System.out.println("video.get720p() = " + video.get720p());
        System.out.println("video.get1080p() = " + video.get1080p());
        System.out.println("===================================");
        AbstractFactory factory1 = new QiNiuYunOssFactory();
        OssVideo video1 = factory1.updateVideo(null);
        System.out.println("video1.get720p() = " + video1.get720p());
        System.out.println("video1.get1080p() = " + video1.get1080p());

        System.out.println("this is  now github projetc");
        System.out.println("yes  yes");
    }
}
