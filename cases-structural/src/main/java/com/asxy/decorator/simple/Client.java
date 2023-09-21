package com.asxy.decorator.simple;

/**
 * Created by asxy on 2023/9/21
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA(concreteComponent);
        a.operation();

        System.out.println("====================");

        ConcreteDecoratorB b = new ConcreteDecoratorB(a);
        b.operation();
    }
}
