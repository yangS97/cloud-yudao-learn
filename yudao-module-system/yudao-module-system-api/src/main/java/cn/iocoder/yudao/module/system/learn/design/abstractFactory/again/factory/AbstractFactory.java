package cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.factory;

import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssImage;
import cn.iocoder.yudao.module.system.learn.design.abstractFactory.again.oss.OssVideo;

/**
 * @author YS
 * @date 2022/12/18 17:12
 * @Description  抽象工厂
 */
public interface AbstractFactory {
    OssImage updateImage(byte[] bytes);
    OssVideo updateVideo(byte[] bytes);
}
