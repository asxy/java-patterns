package com.asxy.composite;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public abstract class AbstractFile {

    protected String name;

    public AbstractFile(String name){
        this.name = name;
    }

    protected abstract void destroyVirus();
}
