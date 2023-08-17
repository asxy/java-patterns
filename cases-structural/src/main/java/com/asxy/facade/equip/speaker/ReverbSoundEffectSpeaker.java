package com.asxy.facade.equip.speaker;

import com.asxy.facade.equip.Speaker;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class ReverbSoundEffectSpeaker extends Speaker {
    @Override
    public void showEffects() {
        System.out.println("音响使用混响效果");
    }
}
