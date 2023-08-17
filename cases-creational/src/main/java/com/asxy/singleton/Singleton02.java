package com.asxy.singleton;

/**
 * @Author asxy
 * @Version 1.0
 * @Description: 懒汉式
 * @Date 2023/8/16
 */
public class Singleton02 {

    public Singleton02() {
    }

    private static volatile Singleton02 instance;

    public static Singleton02 getInstance() {
        if (instance == null) {
            synchronized (Singleton02.class) {
                if (instance == null) {
                    instance = new Singleton02();
                }
            }
        }
        return instance;
    }
}
