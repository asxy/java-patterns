package com.asxy.facade.equip.bulb.decorator;

import com.asxy.facade.equip.Bulb;
import com.asxy.facade.equip.bulb.LightEffectDecorator;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class StrobeEffectDecorator extends LightEffectDecorator {

    public StrobeEffectDecorator(Bulb bulb) {
        super(bulb);
    }

    @Override
    public String attachEffects() {
        return "闪烁效果的" + super.bulb.attachEffects();
    }
}
