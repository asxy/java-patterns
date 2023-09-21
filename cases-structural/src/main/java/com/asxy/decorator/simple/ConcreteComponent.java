package com.asxy.decorator.simple;

/**
 * Created by asxy on 2023/9/21
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
