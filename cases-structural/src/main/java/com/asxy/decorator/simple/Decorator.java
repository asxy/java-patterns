package com.asxy.decorator.simple;

/**
 * Created by asxy on 2023/9/21
 */
public abstract class Decorator extends Component{

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }
}
