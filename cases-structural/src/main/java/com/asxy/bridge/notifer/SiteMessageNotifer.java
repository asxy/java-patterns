package com.asxy.bridge.notifer;

import com.asxy.bridge.AbstractNotifer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class SiteMessageNotifer extends AbstractNotifer {
    public SiteMessageNotifer(String identity, String content) {
        super(identity, content);
    }

    @Override
    public void doNotify() {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time + "发送站内信, 用户名:" + super.identity + ", 内容:" + super.content);
    }
}
