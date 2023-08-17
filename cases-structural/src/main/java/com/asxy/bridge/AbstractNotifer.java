package com.asxy.bridge;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public abstract class AbstractNotifer {

    protected final String identity;

    protected String content;

    public AbstractNotifer(String identity, String content) {
        this.identity = identity;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract void doNotify();
}
