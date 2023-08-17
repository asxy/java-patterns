package com.asxy.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    protected void setTarget(Object target) {
        this.target = target;
    }

    protected Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象的java类型" + proxy.getClass().getSimpleName());
        System.out.println("调用的方法名" + method.getName());
        System.out.println("调用的方法参数" + Arrays.toString(args));

        System.out.println("=====>执行目标方法之前");
        Object res = method.invoke(target, args);
        System.out.println("返回" + res);
        System.out.println("执行目标方法之后");
        return res;
    }
}
