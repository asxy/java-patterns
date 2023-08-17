package com.asxy.composite;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class Folder extends AbstractFile {

    private final List<AbstractFile> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(AbstractFile item) {
        this.children.add(item);
    }

    @Override
    protected void destroyVirus() {
        System.out.println(MessageFormat.format("开始处理文件夹{0}....", super.name));
        children.forEach(AbstractFile::destroyVirus);
    }
}
