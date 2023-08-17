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
public class TimerExecutor extends AbstractTriggerExecutor {

    private final String express;

    public TimerExecutor(AbstractNotifer notifer, String express) {
        super(notifer);
        this.express = express;
    }

    @Override
    protected void execute() throws InterruptedException {

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(MessageFormat.format("{0}已提交通知到定时处理器,定时表达式为{1}...", time, express));
        Thread.sleep(2000);
        int num = 2;
        double total = 38900.0;
        String content = MessageFormat.format(super.notifer.getContent(), num, total);
        super.notifer.setContent(content);
        super.notifer.doNotify();

    }
}
