package com.asxy.proxy.jdk_proxy;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("================开始");
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(new AnyServiceImpl());
        AnyService proxy = (AnyService) handler.getProxy();
        proxy.taregetFunc1(1);
    }
}
