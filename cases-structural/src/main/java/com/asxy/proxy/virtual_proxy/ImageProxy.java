package com.asxy.proxy.virtual_proxy;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/13
 */
public class ImageProxy implements Graphic {

    private Image image;

    private final String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void draw() {
        if(image == null){
            this.image = new Image(this.fileName);
        }
        this.image.draw();
    }

    @Override
    public double getWidth() {
        if(image == null){
            System.out.println("图片宽度为50,当前未加载图片,使用默认图像");
            return 50;
        }
        return image.getWidth();
    }

    @Override
    public double getHeight() {
        if(image == null){
            System.out.println("图片高度为50,当前未加载图片,使用默认图像");
            return 50;
        }
        return image.getHeight();
    }

    @Override
    public void store() {
        if(image != null){
            this.image.store();
        }

    }
}
