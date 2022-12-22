package cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.factory.impl;

import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.factory.AbstractFactory;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssImage;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssVideo;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.impl.QiNiuYunImage;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.impl.QiNiuYunVideo;

/**
 * @author YS
 * @date 2022/12/18 17:14
 * @Description 七牛云
 */
public class QiNiuYunOssFactory implements AbstractFactory {
    public QiNiuYunOssFactory() {
        System.out.println("七牛云缩略图");
        System.out.println("七牛云预览图");
        System.out.println("七牛云图片增强图");
    }

    @Override
    public OssImage updateImage(byte[] bytes) {
        return new QiNiuYunImage();
    }

    @Override
    public OssVideo updateVideo(byte[] bytes) {
        return new QiNiuYunVideo();
    }
}
