package com.asxy.facade.equip.bulb;

import com.asxy.facade.equip.Bulb;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public abstract class LightEffectDecorator extends Bulb {

    protected final Bulb bulb;

    public LightEffectDecorator(Bulb bulb) {
        this.bulb = bulb;
    }
}
