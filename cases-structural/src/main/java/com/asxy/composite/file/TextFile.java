package com.asxy.composite.file;

import com.asxy.composite.AbstractFile;

import java.text.MessageFormat;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class TextFile extends AbstractFile {

    public TextFile(String name) {
        super(name);
    }

    @Override
    protected void destroyVirus() {
        System.out.println(MessageFormat.format("文本文件{0}开始杀毒", super.name));
    }
}
