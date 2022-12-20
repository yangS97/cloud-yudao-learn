package cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.factory.impl;

import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.factory.AbstractFactory;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssImage;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssVideo;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.impl.AliyunImage;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.impl.AliyunVideo;

/**
 * @author YS
 * @date 2022/12/18 17:14
 * @Description 七牛云
 */
public class AliyunOssFactory implements AbstractFactory {
    public AliyunOssFactory() {
        System.out.println("阿里云缩略图");
        System.out.println("阿里云预览图");
        System.out.println("阿里云图片增强图");
    }

    @Override
    public OssImage updateImage(byte[] bytes) {
        return new AliyunImage();
    }

    @Override
    public OssVideo updateVideo(byte[] bytes) {
        return new AliyunVideo();
    }
}
