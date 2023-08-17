package com.asxy.bridge.notifer;

import com.asxy.bridge.AbstractNotifer;
import com.asxy.composite.AbstractFile;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class MailNotifer extends AbstractNotifer {

    public MailNotifer(String identity, String content) {
        super(identity, content);
    }

    @Override
    public void doNotify() {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(MessageFormat.format("{0}发送邮件, 邮箱地址:{1}, 内容:{2}", time, super.identity, super.content));
    }
}
