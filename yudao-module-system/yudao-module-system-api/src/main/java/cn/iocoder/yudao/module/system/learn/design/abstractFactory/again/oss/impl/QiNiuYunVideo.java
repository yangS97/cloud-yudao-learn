package cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.impl;

import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssVideo;

/**
 * @author YS
 * @date 2022/12/18 17:19
 * @Description
 */
public class QiNiuYunVideo implements OssVideo {


    @Override
    public String get720p() {
        return "返回七牛云视频720p";
    }

    @Override
    public String get1080p() {
        return "返回七牛云视频1080p";
    }
}
