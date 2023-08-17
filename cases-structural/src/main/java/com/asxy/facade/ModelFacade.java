package com.asxy.facade;

import com.asxy.facade.equip.bulb.GreenBulb;
import com.asxy.facade.equip.bulb.ReadBulb;
import com.asxy.facade.equip.bulb.YellowBulb;
import com.asxy.facade.equip.bulb.decorator.BrightEffectDecorator;
import com.asxy.facade.equip.bulb.decorator.MarqueeEffectDecorator;
import com.asxy.facade.equip.bulb.decorator.StrobeEffectDecorator;
import com.asxy.facade.equip.speaker.EchoSoundEffectsSpeaker;
import com.asxy.facade.equip.speaker.OriginalSoundEffectSpeaker;
import com.asxy.facade.equip.speaker.ReverbSoundEffectSpeaker;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public enum ModelFacade {
    INSTANCE;

    private Equipment redBulb = new MarqueeEffectDecorator(new ReadBulb());

    private Equipment greenBulb = new MarqueeEffectDecorator(new GreenBulb());

    private Equipment yellowBulb = new MarqueeEffectDecorator(new YellowBulb());

    private Equipment speaker = new EchoSoundEffectsSpeaker();

    public void open() {
        System.out.println("===========打开设备");
        this.redBulb.on();
        this.greenBulb.on();
        this.yellowBulb.on();
        this.speaker.on();
        this.liveMode();
    }

    public void close() {
        System.out.println("===========关闭设备");
        this.redBulb.off();
        this.greenBulb.off();
        this.yellowBulb.off();
        this.speaker.off();
    }

    public void familyMode() {
        System.out.println("居家模式--------------------");
        this.greenBulb = new BrightEffectDecorator(new GreenBulb());
        this.yellowBulb = new BrightEffectDecorator(new YellowBulb());
        this.speaker = new ReverbSoundEffectSpeaker();
        System.out.println("灯光效果--------------");
        this.greenBulb.showEffects();
        this.yellowBulb.showEffects();
        System.out.println("音响效果---------------");
        this.speaker.showEffects();
    }

    public void liveMode() {
        System.out.println("现场模式--------------------");
        this.redBulb = new MarqueeEffectDecorator(new ReadBulb());
        this.greenBulb = new MarqueeEffectDecorator(new GreenBulb());
        this.yellowBulb = new MarqueeEffectDecorator(new YellowBulb());
        this.speaker = new EchoSoundEffectsSpeaker();
        System.out.println("灯光效果--------------");
        this.redBulb.showEffects();
        this.greenBulb.showEffects();
        this.yellowBulb.showEffects();
        System.out.println("音响效果---------------");
        this.speaker.showEffects();
    }

    public void professionalMode() {
        System.out.println("专业模式--------------------");
        this.greenBulb = new StrobeEffectDecorator(new GreenBulb());
        this.speaker = new OriginalSoundEffectSpeaker();
        this.speaker = new ReverbSoundEffectSpeaker();
        System.out.println("灯光效果--------------");
        this.greenBulb.showEffects();
        System.out.println("音响效果---------------");
        this.speaker.showEffects();
    }
}