package cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.impl;

import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssImage;

/**
 * @author YS
 * @date 2022/12/18 17:19
 * @Description
 */
public class AliyunImage implements OssImage {
    @Override
    public String getThumb() {
        return "返回阿里云图片缩略图";
    }

    @Override
    public String getPreview() {
        return "返回阿里云图片预览图";
    }

    @Override
    public String getEnhance() {
        return "返回阿里云图片增强图";
    }
}
