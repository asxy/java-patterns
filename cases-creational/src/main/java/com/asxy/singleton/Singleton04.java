package com.asxy.singleton;

/**
 * 静态内部类
 * &#064;Author  asxy
 * &#064;Version  1.0
 * &#064;Date  2023/8/17
 */
public class Singleton04 {
    public Singleton04() {
    }

    public static Singleton04 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static final Singleton04 instance = new Singleton04();
    }
}
