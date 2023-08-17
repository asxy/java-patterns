package com.asxy.bridge.executor;

import com.asxy.bridge.AbstractNotifer;
import com.asxy.bridge.AbstractTriggerExecutor;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class DelayExecutor extends AbstractTriggerExecutor {

    private final int delaySeconds;

    public DelayExecutor(AbstractNotifer notifer, int delaySeconds) {
        super(notifer);
        this.delaySeconds = delaySeconds;
    }

    @Override
    protected void execute() throws InterruptedException {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(MessageFormat.format("{0}已提交通知到延迟执行处理器...", time));
        Thread.sleep(delaySeconds * 1000L);
        super.notifer.doNotify();
    }
}
