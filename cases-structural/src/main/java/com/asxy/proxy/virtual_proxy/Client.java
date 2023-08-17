package com.asxy.proxy.virtual_proxy;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/13
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=====> 打开文档[/res/a.png]------------");
        ImageProxy imageProxy = new ImageProxy("res/a.png");
        System.out.println("获取图片宽度");
        imageProxy.getWidth();
        imageProxy.draw();
        System.out.println("获取图片高度");
        imageProxy.getHeight();

    }
}
