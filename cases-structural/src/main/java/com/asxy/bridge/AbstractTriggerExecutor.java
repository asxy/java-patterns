package com.asxy.bridge;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public abstract class AbstractTriggerExecutor {

    protected final AbstractNotifer notifer;

    public AbstractTriggerExecutor(AbstractNotifer notifer) {
        this.notifer = notifer;
    }

    protected abstract void execute() throws InterruptedException;
}
