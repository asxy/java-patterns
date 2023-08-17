package com.asxy.facade.equip.bulb.decorator;

import com.asxy.facade.equip.Bulb;
import com.asxy.facade.equip.bulb.LightEffectDecorator;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class BrightEffectDecorator extends LightEffectDecorator {
    public BrightEffectDecorator(Bulb bulb) {
        super(bulb);
    }

    @Override
    public String attachEffects() {
        return "常亮效果的"+super.bulb.attachEffects();
    }
}
