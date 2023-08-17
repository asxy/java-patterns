package com.asxy.bridge.notifer;

import com.asxy.bridge.AbstractNotifer;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class RobotCallNotifer extends AbstractNotifer {

    public RobotCallNotifer(String identity, String content) {
        super(identity, content);
    }

    @Override
    public void doNotify() {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(MessageFormat.format("{0}发起机器人语音通话, 手机号码{1}, 内容{2}", time, super.identity, super.content));
    }
}
