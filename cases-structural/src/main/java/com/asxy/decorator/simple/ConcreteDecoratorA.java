package com.asxy.decorator.simple;

/**
 * Created by asxy on 2023/9/21
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("具体修饰对象A的操作");
    }
}
