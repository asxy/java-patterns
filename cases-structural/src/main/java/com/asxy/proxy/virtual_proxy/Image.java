package com.asxy.proxy.virtual_proxy;

import java.text.MessageFormat;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/13
 */
public class Image implements Graphic {

    private final String fileName;

    private double width;

    private double height;

    public Image(String fileName) {
        this.fileName = fileName;
        this.loadImage(fileName);
    }

    private void loadImage(String fileName) {
        System.out.println("      开始加载图片");
        width = Math.random() * (50) + 51;
        height = Math.random() * (50) + 51;
    }

    @Override
    public void draw() {
        System.out.println(MessageFormat.format("   已绘制图片{0}", this.fileName));
    }

    @Override
    public double getWidth() {
        System.out.println(MessageFormat.format("   图片的宽度为{1}", this.width));
        return this.width;
    }

    @Override
    public double getHeight() {
        System.out.println(MessageFormat.format("    图片的宽度为{0}", this.height));
        return this.height;
    }

    @Override
    public void store() {
        System.out.println(MessageFormat.format("    图片{0}已存储", this.fileName));
    }
}
