package com.asxy.facade.equip;

import com.asxy.facade.Equipment;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public abstract class Speaker implements Equipment {

    @Override
    public void on() {
        System.out.println("打开音响");
    }

    @Override
    public void off() {
        System.out.println("关闭音响");
    }
}
