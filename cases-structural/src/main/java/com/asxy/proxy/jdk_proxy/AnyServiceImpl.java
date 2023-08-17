package com.asxy.proxy.jdk_proxy;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class AnyServiceImpl implements AnyService{
    @Override
    public void targetFunc0() {
        System.out.println("=====>执行目标方法");
    }

    @Override
    public String taregetFunc1(int num) {
        return "Anything";
    }
}
