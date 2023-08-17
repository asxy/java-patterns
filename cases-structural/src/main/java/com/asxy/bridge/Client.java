package com.asxy.bridge;

import com.asxy.bridge.executor.DelayExecutor;
import com.asxy.bridge.executor.ImmediatelyExecutor;
import com.asxy.bridge.executor.TimerExecutor;
import com.asxy.bridge.notifer.MailNotifer;
import com.asxy.bridge.notifer.RobotCallNotifer;
import com.asxy.bridge.notifer.ShortMessageNotifer;
import com.asxy.bridge.notifer.SiteMessageNotifer;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("|==> Start ---------------------------------------------------------------------------------------|");
        // 立即发送站内消息
        AbstractNotifer notifer1 = new SiteMessageNotifer("coder", "您的物流已更新，详情请查看：https://gitee.com/ry_always/DesignPatterns");
        AbstractTriggerExecutor executor1 = new ImmediatelyExecutor(notifer1);
        executor1.execute();
        // 3s后发起语音通话
        AbstractNotifer notifer2 = new RobotCallNotifer("18890907878", "您已连续浏览 2 小时，请注意防护用眼过度！");
        AbstractTriggerExecutor executor2 = new DelayExecutor(notifer2, 3);
        executor2.execute();
        // 下月初发送统计邮件
        AbstractNotifer notifer3 = new MailNotifer("uyu-90@hotel.com", "这个月您一共买了 {0} 件衣服，共计消费 {1} 元！");
        AbstractTriggerExecutor executor3 = new TimerExecutor(notifer3, "0 0 0 0 1/1 ?");
        executor3.execute();

    }
}
