package com.asxy.facade.equip;

import com.asxy.facade.Equipment;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public abstract class Bulb implements Equipment {

    @Override
    public void on() {
        System.out.println(this.attachEffects() + "打开灯泡");
    }

    @Override
    public void off(){
        System.out.println(this.attachEffects() +"关闭灯泡");
    }

    @Override
    public void showEffects(){
        System.out.println(this.attachEffects() +"展示灯泡效果");
    }


    public abstract String attachEffects();
}
