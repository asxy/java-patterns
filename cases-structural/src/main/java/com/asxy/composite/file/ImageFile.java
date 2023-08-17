package com.asxy.composite.file;

import com.asxy.composite.AbstractFile;

import java.text.MessageFormat;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class ImageFile extends AbstractFile {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    protected void destroyVirus() {
        System.out.println(MessageFormat.format("图片文件{0}开始杀毒", super.name));
    }
}
