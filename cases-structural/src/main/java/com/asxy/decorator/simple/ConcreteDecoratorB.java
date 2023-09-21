package com.asxy.decorator.simple;

/**
 * Created by asxy on 2023/9/21
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰对象B操作");
    }
}
