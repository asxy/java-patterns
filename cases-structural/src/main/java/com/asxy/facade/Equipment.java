package com.asxy.facade;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public interface Equipment {

    /**
     * 打开设备
     */
    void on();

    /**
     * 关闭设备
     */
    void off();

    /**
     * 展示设备效果
     */
    void showEffects();
}
