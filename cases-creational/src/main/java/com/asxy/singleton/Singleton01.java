package com.asxy.singleton;

/**
 * @author asxy
 * @version 1.0
 * @description: 饿汉式
 * @date 2023/08/16
 */
public class Singleton01 {

    private Singleton01() {
    }

    private static final Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }
}
